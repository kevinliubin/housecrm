package com.lb.ssm.vo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("userSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("userSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNull() {
            addCriterion("userCard is null");
            return (Criteria) this;
        }

        public Criteria andUsercardIsNotNull() {
            addCriterion("userCard is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardEqualTo(String value) {
            addCriterion("userCard =", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotEqualTo(String value) {
            addCriterion("userCard <>", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThan(String value) {
            addCriterion("userCard >", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardGreaterThanOrEqualTo(String value) {
            addCriterion("userCard >=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThan(String value) {
            addCriterion("userCard <", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLessThanOrEqualTo(String value) {
            addCriterion("userCard <=", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardLike(String value) {
            addCriterion("userCard like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotLike(String value) {
            addCriterion("userCard not like", value, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardIn(List<String> values) {
            addCriterion("userCard in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotIn(List<String> values) {
            addCriterion("userCard not in", values, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardBetween(String value1, String value2) {
            addCriterion("userCard between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardNotBetween(String value1, String value2) {
            addCriterion("userCard not between", value1, value2, "usercard");
            return (Criteria) this;
        }

        public Criteria andUsercardnameIsNull() {
            addCriterion("userCardname is null");
            return (Criteria) this;
        }

        public Criteria andUsercardnameIsNotNull() {
            addCriterion("userCardname is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardnameEqualTo(String value) {
            addCriterion("userCardname =", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameNotEqualTo(String value) {
            addCriterion("userCardname <>", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameGreaterThan(String value) {
            addCriterion("userCardname >", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameGreaterThanOrEqualTo(String value) {
            addCriterion("userCardname >=", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameLessThan(String value) {
            addCriterion("userCardname <", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameLessThanOrEqualTo(String value) {
            addCriterion("userCardname <=", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameLike(String value) {
            addCriterion("userCardname like", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameNotLike(String value) {
            addCriterion("userCardname not like", value, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameIn(List<String> values) {
            addCriterion("userCardname in", values, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameNotIn(List<String> values) {
            addCriterion("userCardname not in", values, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameBetween(String value1, String value2) {
            addCriterion("userCardname between", value1, value2, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUsercardnameNotBetween(String value1, String value2) {
            addCriterion("userCardname not between", value1, value2, "usercardname");
            return (Criteria) this;
        }

        public Criteria andUseraddrIsNull() {
            addCriterion("userAddr is null");
            return (Criteria) this;
        }

        public Criteria andUseraddrIsNotNull() {
            addCriterion("userAddr is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddrEqualTo(String value) {
            addCriterion("userAddr =", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotEqualTo(String value) {
            addCriterion("userAddr <>", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThan(String value) {
            addCriterion("userAddr >", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrGreaterThanOrEqualTo(String value) {
            addCriterion("userAddr >=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThan(String value) {
            addCriterion("userAddr <", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLessThanOrEqualTo(String value) {
            addCriterion("userAddr <=", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrLike(String value) {
            addCriterion("userAddr like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotLike(String value) {
            addCriterion("userAddr not like", value, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrIn(List<String> values) {
            addCriterion("userAddr in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotIn(List<String> values) {
            addCriterion("userAddr not in", values, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrBetween(String value1, String value2) {
            addCriterion("userAddr between", value1, value2, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUseraddrNotBetween(String value1, String value2) {
            addCriterion("userAddr not between", value1, value2, "useraddr");
            return (Criteria) this;
        }

        public Criteria andUserindateIsNull() {
            addCriterion("userInDate is null");
            return (Criteria) this;
        }

        public Criteria andUserindateIsNotNull() {
            addCriterion("userInDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserindateEqualTo(String value) {
            addCriterion("userInDate =", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateNotEqualTo(String value) {
            addCriterion("userInDate <>", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateGreaterThan(String value) {
            addCriterion("userInDate >", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateGreaterThanOrEqualTo(String value) {
            addCriterion("userInDate >=", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateLessThan(String value) {
            addCriterion("userInDate <", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateLessThanOrEqualTo(String value) {
            addCriterion("userInDate <=", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateLike(String value) {
            addCriterion("userInDate like", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateNotLike(String value) {
            addCriterion("userInDate not like", value, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateIn(List<String> values) {
            addCriterion("userInDate in", values, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateNotIn(List<String> values) {
            addCriterion("userInDate not in", values, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateBetween(String value1, String value2) {
            addCriterion("userInDate between", value1, value2, "userindate");
            return (Criteria) this;
        }

        public Criteria andUserindateNotBetween(String value1, String value2) {
            addCriterion("userInDate not between", value1, value2, "userindate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateIsNull() {
            addCriterion("userOutDate is null");
            return (Criteria) this;
        }

        public Criteria andUseroutdateIsNotNull() {
            addCriterion("userOutDate is not null");
            return (Criteria) this;
        }

        public Criteria andUseroutdateEqualTo(String value) {
            addCriterion("userOutDate =", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateNotEqualTo(String value) {
            addCriterion("userOutDate <>", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateGreaterThan(String value) {
            addCriterion("userOutDate >", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateGreaterThanOrEqualTo(String value) {
            addCriterion("userOutDate >=", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateLessThan(String value) {
            addCriterion("userOutDate <", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateLessThanOrEqualTo(String value) {
            addCriterion("userOutDate <=", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateLike(String value) {
            addCriterion("userOutDate like", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateNotLike(String value) {
            addCriterion("userOutDate not like", value, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateIn(List<String> values) {
            addCriterion("userOutDate in", values, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateNotIn(List<String> values) {
            addCriterion("userOutDate not in", values, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateBetween(String value1, String value2) {
            addCriterion("userOutDate between", value1, value2, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUseroutdateNotBetween(String value1, String value2) {
            addCriterion("userOutDate not between", value1, value2, "useroutdate");
            return (Criteria) this;
        }

        public Criteria andUserroleidIsNull() {
            addCriterion("userRoleid is null");
            return (Criteria) this;
        }

        public Criteria andUserroleidIsNotNull() {
            addCriterion("userRoleid is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleidEqualTo(Integer value) {
            addCriterion("userRoleid =", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotEqualTo(Integer value) {
            addCriterion("userRoleid <>", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidGreaterThan(Integer value) {
            addCriterion("userRoleid >", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userRoleid >=", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidLessThan(Integer value) {
            addCriterion("userRoleid <", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidLessThanOrEqualTo(Integer value) {
            addCriterion("userRoleid <=", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidIn(List<Integer> values) {
            addCriterion("userRoleid in", values, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotIn(List<Integer> values) {
            addCriterion("userRoleid not in", values, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidBetween(Integer value1, Integer value2) {
            addCriterion("userRoleid between", value1, value2, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("userRoleid not between", value1, value2, "userroleid");
            return (Criteria) this;
        }

        public Criteria andLoginintimeIsNull() {
            addCriterion("loginIntime is null");
            return (Criteria) this;
        }

        public Criteria andLoginintimeIsNotNull() {
            addCriterion("loginIntime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginintimeEqualTo(String value) {
            addCriterion("loginIntime =", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeNotEqualTo(String value) {
            addCriterion("loginIntime <>", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeGreaterThan(String value) {
            addCriterion("loginIntime >", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeGreaterThanOrEqualTo(String value) {
            addCriterion("loginIntime >=", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeLessThan(String value) {
            addCriterion("loginIntime <", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeLessThanOrEqualTo(String value) {
            addCriterion("loginIntime <=", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeLike(String value) {
            addCriterion("loginIntime like", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeNotLike(String value) {
            addCriterion("loginIntime not like", value, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeIn(List<String> values) {
            addCriterion("loginIntime in", values, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeNotIn(List<String> values) {
            addCriterion("loginIntime not in", values, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeBetween(String value1, String value2) {
            addCriterion("loginIntime between", value1, value2, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginintimeNotBetween(String value1, String value2) {
            addCriterion("loginIntime not between", value1, value2, "loginintime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeIsNull() {
            addCriterion("loginOuttime is null");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeIsNotNull() {
            addCriterion("loginOuttime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeEqualTo(String value) {
            addCriterion("loginOuttime =", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeNotEqualTo(String value) {
            addCriterion("loginOuttime <>", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeGreaterThan(String value) {
            addCriterion("loginOuttime >", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeGreaterThanOrEqualTo(String value) {
            addCriterion("loginOuttime >=", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeLessThan(String value) {
            addCriterion("loginOuttime <", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeLessThanOrEqualTo(String value) {
            addCriterion("loginOuttime <=", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeLike(String value) {
            addCriterion("loginOuttime like", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeNotLike(String value) {
            addCriterion("loginOuttime not like", value, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeIn(List<String> values) {
            addCriterion("loginOuttime in", values, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeNotIn(List<String> values) {
            addCriterion("loginOuttime not in", values, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeBetween(String value1, String value2) {
            addCriterion("loginOuttime between", value1, value2, "loginouttime");
            return (Criteria) this;
        }

        public Criteria andLoginouttimeNotBetween(String value1, String value2) {
            addCriterion("loginOuttime not between", value1, value2, "loginouttime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}