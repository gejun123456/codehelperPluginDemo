package com.codehelper.mapper;

import base.BaseTest;
import com.codehelper.domain.MyUser;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bruce.ge on 2016/12/15.
 */
public class MyUserDaoTest extends BaseTest {

    public static final String COOKIE = "cookie";
    public static final String NAME = "name";
    public static final String PASSWORD = "password";
    @Autowired
    private MyUserDao myUserDao;

    public static final int START_AGE = 30;

    @Before
    public void before() {
        myUserDao.delete();
    }

    private void insertList() {
        List<MyUser> users = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            MyUser myUser = new MyUser();
            myUser.setGlobalId(Long.valueOf(i));
            myUser.setCookie(COOKIE + i);
            myUser.setType(i);
            myUser.setUserName(NAME + i);
            myUser.setPassword(PASSWORD + i);
            myUser.setAge(START_AGE + i);
            myUser.setRemainingAmount(new BigDecimal(i));
            myUser.setAddTime(new Date());
            myUser.setSerialId(Long.valueOf(i));
            users.add(myUser);
        }
        myUserDao.insertList(users);
    }

    private void insertOneRecord() {
        MyUser myUser = new MyUser();
        myUser.setGlobalId(0l);
        myUser.setCookie(COOKIE);
        myUser.setType(0);
        myUser.setUserName(NAME);
        myUser.setPassword(PASSWORD);
        myUser.setAge(START_AGE);
        myUser.setRemainingAmount(new BigDecimal(0));
        myUser.setAddTime(new Date());
        myUser.setSerialId(0l);
        myUserDao.insert(myUser);
    }

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            MyUser myUser = new MyUser();
            myUser.setGlobalId(0L + i);
            myUser.setCookie("cookie" + i);
            myUser.setType(i);
            myUser.setUserName("naem" + i);
            myUser.setPassword("password" + i);
            myUser.setAge(30 + i);
            myUser.setRemainingAmount(new BigDecimal(i));
            myUser.setAddTime(new Date());
            myUser.setSerialId(Long.valueOf(i));
            myUserDao.insert(myUser);
        }
        Assertions.assertThat(myUserDao.count()).isEqualTo(10);
    }

    @Test
    public void testInsertSelective() {
        MyUser myUser = new MyUser();
        myUser.setGlobalId(0L);
        myUser.setRemainingAmount(new BigDecimal("0"));
        myUser.setAddTime(new Date());
        myUser.setSerialId(0L);
        myUserDao.insertSelective(myUser);
        Assertions.assertThat(myUserDao.count()).isEqualTo(1);
    }

    @Test
    public void testInsertList() {
        insertList();
        Assertions.assertThat(myUserDao.count()).isEqualTo(10);
    }

    @Test
    public void testFind() {
        insertList();
        List<MyUser> users = myUserDao.find();
        Assertions.assertThat(users.size()).isEqualTo(10);
        for (MyUser user : users) {
            MyUser byId = myUserDao.findById(user.getId());
            Assertions.assertThat(byId).isNotNull();
        }
        List<MyUser> collect = users.stream().sorted(Comparator.comparing(MyUser::getId)).collect(Collectors.toList());
        Integer minId = collect.get(0).getId();
        Assertions.assertThat(myUserDao.findAgeById(minId)).isEqualTo(START_AGE);
        Assertions.assertThat(myUserDao.findByIdBetweenOrEqualTo(minId + 2, minId + 3).size()).isEqualTo(2);
        Assertions.assertThat(myUserDao.findByIdBetween(minId + 2, minId + 3).size()).isEqualTo(0);
        Assertions.assertThat(myUserDao.findByIdGreaterThanOrEqualTo(minId + 8).size()).isEqualTo(2);
        Assertions.assertThat(myUserDao.findByIdLessThanOrEqualTo(minId + 2).size()).isEqualTo(3);
    }

    @Test
    public void testUpdate() {
        insertOneRecord();
        List<MyUser> users = myUserDao.find();
        Assertions.assertThat(users.size()).isEqualTo(1);
        MyUser myUser = users.get(0);
        Integer oldId = myUser.getId();
        int i = myUserDao.updateUserNameById("newUserName", oldId);
        Assertions.assertThat(i).isEqualTo(1);
        Assertions.assertThat(myUserDao.find().get(0).getUserName()).isEqualTo("newUserName");
    }

    @Test
    public void testDistinct() {

    }

    @Test
    public void testOrderBy() {

    }


    @Test
    public void testCount() {

    }


    @After
    public void after() {
//        myUserDao.delete();
    }


}