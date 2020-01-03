package com.zyp.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameIsNull() {
            addCriterion("user_orgname is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameIsNotNull() {
            addCriterion("user_orgname is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameEqualTo(String value) {
            addCriterion("user_orgname =", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameNotEqualTo(String value) {
            addCriterion("user_orgname <>", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameGreaterThan(String value) {
            addCriterion("user_orgname >", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_orgname >=", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameLessThan(String value) {
            addCriterion("user_orgname <", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameLessThanOrEqualTo(String value) {
            addCriterion("user_orgname <=", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameLike(String value) {
            addCriterion("user_orgname like", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameNotLike(String value) {
            addCriterion("user_orgname not like", value, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameIn(List<String> values) {
            addCriterion("user_orgname in", values, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameNotIn(List<String> values) {
            addCriterion("user_orgname not in", values, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameBetween(String value1, String value2) {
            addCriterion("user_orgname between", value1, value2, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgnameNotBetween(String value1, String value2) {
            addCriterion("user_orgname not between", value1, value2, "userOrgname");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIsNull() {
            addCriterion("user_orgcode is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIsNotNull() {
            addCriterion("user_orgcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeEqualTo(String value) {
            addCriterion("user_orgcode =", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotEqualTo(String value) {
            addCriterion("user_orgcode <>", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThan(String value) {
            addCriterion("user_orgcode >", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_orgcode >=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThan(String value) {
            addCriterion("user_orgcode <", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("user_orgcode <=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLike(String value) {
            addCriterion("user_orgcode like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotLike(String value) {
            addCriterion("user_orgcode not like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIn(List<String> values) {
            addCriterion("user_orgcode in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotIn(List<String> values) {
            addCriterion("user_orgcode not in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeBetween(String value1, String value2) {
            addCriterion("user_orgcode between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotBetween(String value1, String value2) {
            addCriterion("user_orgcode not between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserPenameIsNull() {
            addCriterion("user_pename is null");
            return (Criteria) this;
        }

        public Criteria andUserPenameIsNotNull() {
            addCriterion("user_pename is not null");
            return (Criteria) this;
        }

        public Criteria andUserPenameEqualTo(String value) {
            addCriterion("user_pename =", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameNotEqualTo(String value) {
            addCriterion("user_pename <>", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameGreaterThan(String value) {
            addCriterion("user_pename >", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_pename >=", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameLessThan(String value) {
            addCriterion("user_pename <", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameLessThanOrEqualTo(String value) {
            addCriterion("user_pename <=", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameLike(String value) {
            addCriterion("user_pename like", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameNotLike(String value) {
            addCriterion("user_pename not like", value, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameIn(List<String> values) {
            addCriterion("user_pename in", values, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameNotIn(List<String> values) {
            addCriterion("user_pename not in", values, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameBetween(String value1, String value2) {
            addCriterion("user_pename between", value1, value2, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserPenameNotBetween(String value1, String value2) {
            addCriterion("user_pename not between", value1, value2, "userPename");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeIsNull() {
            addCriterion("user_idcode is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeIsNotNull() {
            addCriterion("user_idcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeEqualTo(String value) {
            addCriterion("user_idcode =", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeNotEqualTo(String value) {
            addCriterion("user_idcode <>", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeGreaterThan(String value) {
            addCriterion("user_idcode >", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcode >=", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeLessThan(String value) {
            addCriterion("user_idcode <", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeLessThanOrEqualTo(String value) {
            addCriterion("user_idcode <=", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeLike(String value) {
            addCriterion("user_idcode like", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeNotLike(String value) {
            addCriterion("user_idcode not like", value, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeIn(List<String> values) {
            addCriterion("user_idcode in", values, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeNotIn(List<String> values) {
            addCriterion("user_idcode not in", values, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeBetween(String value1, String value2) {
            addCriterion("user_idcode between", value1, value2, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserIdcodeNotBetween(String value1, String value2) {
            addCriterion("user_idcode not between", value1, value2, "userIdcode");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("user_status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("user_status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageIsNull() {
            addCriterion("user_editmessage is null");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageIsNotNull() {
            addCriterion("user_editmessage is not null");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageEqualTo(String value) {
            addCriterion("user_editmessage =", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageNotEqualTo(String value) {
            addCriterion("user_editmessage <>", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageGreaterThan(String value) {
            addCriterion("user_editmessage >", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageGreaterThanOrEqualTo(String value) {
            addCriterion("user_editmessage >=", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageLessThan(String value) {
            addCriterion("user_editmessage <", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageLessThanOrEqualTo(String value) {
            addCriterion("user_editmessage <=", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageLike(String value) {
            addCriterion("user_editmessage like", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageNotLike(String value) {
            addCriterion("user_editmessage not like", value, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageIn(List<String> values) {
            addCriterion("user_editmessage in", values, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageNotIn(List<String> values) {
            addCriterion("user_editmessage not in", values, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageBetween(String value1, String value2) {
            addCriterion("user_editmessage between", value1, value2, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserEditmessageNotBetween(String value1, String value2) {
            addCriterion("user_editmessage not between", value1, value2, "userEditmessage");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusIsNull() {
            addCriterion("user_verifystatus is null");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusIsNotNull() {
            addCriterion("user_verifystatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusEqualTo(String value) {
            addCriterion("user_verifystatus =", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusNotEqualTo(String value) {
            addCriterion("user_verifystatus <>", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusGreaterThan(String value) {
            addCriterion("user_verifystatus >", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_verifystatus >=", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusLessThan(String value) {
            addCriterion("user_verifystatus <", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusLessThanOrEqualTo(String value) {
            addCriterion("user_verifystatus <=", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusLike(String value) {
            addCriterion("user_verifystatus like", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusNotLike(String value) {
            addCriterion("user_verifystatus not like", value, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusIn(List<String> values) {
            addCriterion("user_verifystatus in", values, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusNotIn(List<String> values) {
            addCriterion("user_verifystatus not in", values, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusBetween(String value1, String value2) {
            addCriterion("user_verifystatus between", value1, value2, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserVerifystatusNotBetween(String value1, String value2) {
            addCriterion("user_verifystatus not between", value1, value2, "userVerifystatus");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNull() {
            addCriterion("user_createTime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNotNull() {
            addCriterion("user_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeEqualTo(Date value) {
            addCriterion("user_createTime =", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotEqualTo(Date value) {
            addCriterion("user_createTime <>", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThan(Date value) {
            addCriterion("user_createTime >", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_createTime >=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThan(Date value) {
            addCriterion("user_createTime <", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("user_createTime <=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIn(List<Date> values) {
            addCriterion("user_createTime in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotIn(List<Date> values) {
            addCriterion("user_createTime not in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeBetween(Date value1, Date value2) {
            addCriterion("user_createTime between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("user_createTime not between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeIsNull() {
            addCriterion("user_modifiedTime is null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeIsNotNull() {
            addCriterion("user_modifiedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeEqualTo(Date value) {
            addCriterion("user_modifiedTime =", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeNotEqualTo(Date value) {
            addCriterion("user_modifiedTime <>", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeGreaterThan(Date value) {
            addCriterion("user_modifiedTime >", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_modifiedTime >=", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeLessThan(Date value) {
            addCriterion("user_modifiedTime <", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("user_modifiedTime <=", value, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeIn(List<Date> values) {
            addCriterion("user_modifiedTime in", values, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeNotIn(List<Date> values) {
            addCriterion("user_modifiedTime not in", values, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("user_modifiedTime between", value1, value2, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("user_modifiedTime not between", value1, value2, "userModifiedtime");
            return (Criteria) this;
        }

        public Criteria andUserStroneIsNull() {
            addCriterion("user_strOne is null");
            return (Criteria) this;
        }

        public Criteria andUserStroneIsNotNull() {
            addCriterion("user_strOne is not null");
            return (Criteria) this;
        }

        public Criteria andUserStroneEqualTo(String value) {
            addCriterion("user_strOne =", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneNotEqualTo(String value) {
            addCriterion("user_strOne <>", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneGreaterThan(String value) {
            addCriterion("user_strOne >", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneGreaterThanOrEqualTo(String value) {
            addCriterion("user_strOne >=", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneLessThan(String value) {
            addCriterion("user_strOne <", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneLessThanOrEqualTo(String value) {
            addCriterion("user_strOne <=", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneLike(String value) {
            addCriterion("user_strOne like", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneNotLike(String value) {
            addCriterion("user_strOne not like", value, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneIn(List<String> values) {
            addCriterion("user_strOne in", values, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneNotIn(List<String> values) {
            addCriterion("user_strOne not in", values, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneBetween(String value1, String value2) {
            addCriterion("user_strOne between", value1, value2, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStroneNotBetween(String value1, String value2) {
            addCriterion("user_strOne not between", value1, value2, "userStrone");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoIsNull() {
            addCriterion("user_strTwo is null");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoIsNotNull() {
            addCriterion("user_strTwo is not null");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoEqualTo(String value) {
            addCriterion("user_strTwo =", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoNotEqualTo(String value) {
            addCriterion("user_strTwo <>", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoGreaterThan(String value) {
            addCriterion("user_strTwo >", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoGreaterThanOrEqualTo(String value) {
            addCriterion("user_strTwo >=", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoLessThan(String value) {
            addCriterion("user_strTwo <", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoLessThanOrEqualTo(String value) {
            addCriterion("user_strTwo <=", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoLike(String value) {
            addCriterion("user_strTwo like", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoNotLike(String value) {
            addCriterion("user_strTwo not like", value, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoIn(List<String> values) {
            addCriterion("user_strTwo in", values, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoNotIn(List<String> values) {
            addCriterion("user_strTwo not in", values, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoBetween(String value1, String value2) {
            addCriterion("user_strTwo between", value1, value2, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrtwoNotBetween(String value1, String value2) {
            addCriterion("user_strTwo not between", value1, value2, "userStrtwo");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeIsNull() {
            addCriterion("user_strThree is null");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeIsNotNull() {
            addCriterion("user_strThree is not null");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeEqualTo(String value) {
            addCriterion("user_strThree =", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeNotEqualTo(String value) {
            addCriterion("user_strThree <>", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeGreaterThan(String value) {
            addCriterion("user_strThree >", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeGreaterThanOrEqualTo(String value) {
            addCriterion("user_strThree >=", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeLessThan(String value) {
            addCriterion("user_strThree <", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeLessThanOrEqualTo(String value) {
            addCriterion("user_strThree <=", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeLike(String value) {
            addCriterion("user_strThree like", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeNotLike(String value) {
            addCriterion("user_strThree not like", value, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeIn(List<String> values) {
            addCriterion("user_strThree in", values, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeNotIn(List<String> values) {
            addCriterion("user_strThree not in", values, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeBetween(String value1, String value2) {
            addCriterion("user_strThree between", value1, value2, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrthreeNotBetween(String value1, String value2) {
            addCriterion("user_strThree not between", value1, value2, "userStrthree");
            return (Criteria) this;
        }

        public Criteria andUserStrfourIsNull() {
            addCriterion("user_strFour is null");
            return (Criteria) this;
        }

        public Criteria andUserStrfourIsNotNull() {
            addCriterion("user_strFour is not null");
            return (Criteria) this;
        }

        public Criteria andUserStrfourEqualTo(String value) {
            addCriterion("user_strFour =", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourNotEqualTo(String value) {
            addCriterion("user_strFour <>", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourGreaterThan(String value) {
            addCriterion("user_strFour >", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourGreaterThanOrEqualTo(String value) {
            addCriterion("user_strFour >=", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourLessThan(String value) {
            addCriterion("user_strFour <", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourLessThanOrEqualTo(String value) {
            addCriterion("user_strFour <=", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourLike(String value) {
            addCriterion("user_strFour like", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourNotLike(String value) {
            addCriterion("user_strFour not like", value, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourIn(List<String> values) {
            addCriterion("user_strFour in", values, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourNotIn(List<String> values) {
            addCriterion("user_strFour not in", values, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourBetween(String value1, String value2) {
            addCriterion("user_strFour between", value1, value2, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfourNotBetween(String value1, String value2) {
            addCriterion("user_strFour not between", value1, value2, "userStrfour");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveIsNull() {
            addCriterion("user_strFive is null");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveIsNotNull() {
            addCriterion("user_strFive is not null");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveEqualTo(String value) {
            addCriterion("user_strFive =", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveNotEqualTo(String value) {
            addCriterion("user_strFive <>", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveGreaterThan(String value) {
            addCriterion("user_strFive >", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveGreaterThanOrEqualTo(String value) {
            addCriterion("user_strFive >=", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveLessThan(String value) {
            addCriterion("user_strFive <", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveLessThanOrEqualTo(String value) {
            addCriterion("user_strFive <=", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveLike(String value) {
            addCriterion("user_strFive like", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveNotLike(String value) {
            addCriterion("user_strFive not like", value, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveIn(List<String> values) {
            addCriterion("user_strFive in", values, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveNotIn(List<String> values) {
            addCriterion("user_strFive not in", values, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveBetween(String value1, String value2) {
            addCriterion("user_strFive between", value1, value2, "userStrfive");
            return (Criteria) this;
        }

        public Criteria andUserStrfiveNotBetween(String value1, String value2) {
            addCriterion("user_strFive not between", value1, value2, "userStrfive");
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