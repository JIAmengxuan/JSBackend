package ie.tcd.ase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
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

        public Criteria andStartPositionIsNull() {
            addCriterion("start_position is null");
            return (Criteria) this;
        }

        public Criteria andStartPositionIsNotNull() {
            addCriterion("start_position is not null");
            return (Criteria) this;
        }

        public Criteria andStartPositionEqualTo(String value) {
            addCriterion("start_position =", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionNotEqualTo(String value) {
            addCriterion("start_position <>", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionGreaterThan(String value) {
            addCriterion("start_position >", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionGreaterThanOrEqualTo(String value) {
            addCriterion("start_position >=", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionLessThan(String value) {
            addCriterion("start_position <", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionLessThanOrEqualTo(String value) {
            addCriterion("start_position <=", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionLike(String value) {
            addCriterion("start_position like", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionNotLike(String value) {
            addCriterion("start_position not like", value, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionIn(List<String> values) {
            addCriterion("start_position in", values, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionNotIn(List<String> values) {
            addCriterion("start_position not in", values, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionBetween(String value1, String value2) {
            addCriterion("start_position between", value1, value2, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionNotBetween(String value1, String value2) {
            addCriterion("start_position not between", value1, value2, "startPosition");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeIsNull() {
            addCriterion("start_position_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeIsNotNull() {
            addCriterion("start_position_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeEqualTo(String value) {
            addCriterion("start_position_longitude =", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeNotEqualTo(String value) {
            addCriterion("start_position_longitude <>", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeGreaterThan(String value) {
            addCriterion("start_position_longitude >", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("start_position_longitude >=", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeLessThan(String value) {
            addCriterion("start_position_longitude <", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeLessThanOrEqualTo(String value) {
            addCriterion("start_position_longitude <=", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeLike(String value) {
            addCriterion("start_position_longitude like", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeNotLike(String value) {
            addCriterion("start_position_longitude not like", value, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeIn(List<String> values) {
            addCriterion("start_position_longitude in", values, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeNotIn(List<String> values) {
            addCriterion("start_position_longitude not in", values, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeBetween(String value1, String value2) {
            addCriterion("start_position_longitude between", value1, value2, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLongitudeNotBetween(String value1, String value2) {
            addCriterion("start_position_longitude not between", value1, value2, "startPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeIsNull() {
            addCriterion("start_position_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeIsNotNull() {
            addCriterion("start_position_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeEqualTo(String value) {
            addCriterion("start_position_latitude =", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeNotEqualTo(String value) {
            addCriterion("start_position_latitude <>", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeGreaterThan(String value) {
            addCriterion("start_position_latitude >", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("start_position_latitude >=", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeLessThan(String value) {
            addCriterion("start_position_latitude <", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeLessThanOrEqualTo(String value) {
            addCriterion("start_position_latitude <=", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeLike(String value) {
            addCriterion("start_position_latitude like", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeNotLike(String value) {
            addCriterion("start_position_latitude not like", value, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeIn(List<String> values) {
            addCriterion("start_position_latitude in", values, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeNotIn(List<String> values) {
            addCriterion("start_position_latitude not in", values, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeBetween(String value1, String value2) {
            addCriterion("start_position_latitude between", value1, value2, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andStartPositionLatitudeNotBetween(String value1, String value2) {
            addCriterion("start_position_latitude not between", value1, value2, "startPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionIsNull() {
            addCriterion("end_position is null");
            return (Criteria) this;
        }

        public Criteria andEndPositionIsNotNull() {
            addCriterion("end_position is not null");
            return (Criteria) this;
        }

        public Criteria andEndPositionEqualTo(String value) {
            addCriterion("end_position =", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotEqualTo(String value) {
            addCriterion("end_position <>", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionGreaterThan(String value) {
            addCriterion("end_position >", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionGreaterThanOrEqualTo(String value) {
            addCriterion("end_position >=", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionLessThan(String value) {
            addCriterion("end_position <", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionLessThanOrEqualTo(String value) {
            addCriterion("end_position <=", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionLike(String value) {
            addCriterion("end_position like", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotLike(String value) {
            addCriterion("end_position not like", value, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionIn(List<String> values) {
            addCriterion("end_position in", values, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotIn(List<String> values) {
            addCriterion("end_position not in", values, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionBetween(String value1, String value2) {
            addCriterion("end_position between", value1, value2, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionNotBetween(String value1, String value2) {
            addCriterion("end_position not between", value1, value2, "endPosition");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeIsNull() {
            addCriterion("end_position_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeIsNotNull() {
            addCriterion("end_position_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeEqualTo(String value) {
            addCriterion("end_position_longitude =", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeNotEqualTo(String value) {
            addCriterion("end_position_longitude <>", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeGreaterThan(String value) {
            addCriterion("end_position_longitude >", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("end_position_longitude >=", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeLessThan(String value) {
            addCriterion("end_position_longitude <", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeLessThanOrEqualTo(String value) {
            addCriterion("end_position_longitude <=", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeLike(String value) {
            addCriterion("end_position_longitude like", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeNotLike(String value) {
            addCriterion("end_position_longitude not like", value, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeIn(List<String> values) {
            addCriterion("end_position_longitude in", values, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeNotIn(List<String> values) {
            addCriterion("end_position_longitude not in", values, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeBetween(String value1, String value2) {
            addCriterion("end_position_longitude between", value1, value2, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLongitudeNotBetween(String value1, String value2) {
            addCriterion("end_position_longitude not between", value1, value2, "endPositionLongitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeIsNull() {
            addCriterion("end_position_latitude is null");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeIsNotNull() {
            addCriterion("end_position_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeEqualTo(String value) {
            addCriterion("end_position_latitude =", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeNotEqualTo(String value) {
            addCriterion("end_position_latitude <>", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeGreaterThan(String value) {
            addCriterion("end_position_latitude >", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("end_position_latitude >=", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeLessThan(String value) {
            addCriterion("end_position_latitude <", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeLessThanOrEqualTo(String value) {
            addCriterion("end_position_latitude <=", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeLike(String value) {
            addCriterion("end_position_latitude like", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeNotLike(String value) {
            addCriterion("end_position_latitude not like", value, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeIn(List<String> values) {
            addCriterion("end_position_latitude in", values, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeNotIn(List<String> values) {
            addCriterion("end_position_latitude not in", values, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeBetween(String value1, String value2) {
            addCriterion("end_position_latitude between", value1, value2, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andEndPositionLatitudeNotBetween(String value1, String value2) {
            addCriterion("end_position_latitude not between", value1, value2, "endPositionLatitude");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNull() {
            addCriterion("weekday is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("weekday is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(Integer value) {
            addCriterion("weekday =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(Integer value) {
            addCriterion("weekday <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(Integer value) {
            addCriterion("weekday >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekday >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(Integer value) {
            addCriterion("weekday <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("weekday <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<Integer> values) {
            addCriterion("weekday in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<Integer> values) {
            addCriterion("weekday not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("weekday between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("weekday not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andStartDurationIsNull() {
            addCriterion("start_duration is null");
            return (Criteria) this;
        }

        public Criteria andStartDurationIsNotNull() {
            addCriterion("start_duration is not null");
            return (Criteria) this;
        }

        public Criteria andStartDurationEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration =", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration <>", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationGreaterThan(Date value) {
            addCriterionForJDBCDate("start_duration >", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration >=", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationLessThan(Date value) {
            addCriterionForJDBCDate("start_duration <", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration <=", value, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationIn(List<Date> values) {
            addCriterionForJDBCDate("start_duration in", values, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_duration not in", values, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_duration between", value1, value2, "startDuration");
            return (Criteria) this;
        }

        public Criteria andStartDurationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_duration not between", value1, value2, "startDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationIsNull() {
            addCriterion("end_duration is null");
            return (Criteria) this;
        }

        public Criteria andEndDurationIsNotNull() {
            addCriterion("end_duration is not null");
            return (Criteria) this;
        }

        public Criteria andEndDurationEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration =", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration <>", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationGreaterThan(Date value) {
            addCriterionForJDBCDate("end_duration >", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration >=", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationLessThan(Date value) {
            addCriterionForJDBCDate("end_duration <", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration <=", value, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationIn(List<Date> values) {
            addCriterionForJDBCDate("end_duration in", values, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_duration not in", values, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_duration between", value1, value2, "endDuration");
            return (Criteria) this;
        }

        public Criteria andEndDurationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_duration not between", value1, value2, "endDuration");
            return (Criteria) this;
        }

        public Criteria andStartDuration2IsNull() {
            addCriterion("start_duration2 is null");
            return (Criteria) this;
        }

        public Criteria andStartDuration2IsNotNull() {
            addCriterion("start_duration2 is not null");
            return (Criteria) this;
        }

        public Criteria andStartDuration2EqualTo(Date value) {
            addCriterionForJDBCDate("start_duration2 =", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2NotEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration2 <>", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2GreaterThan(Date value) {
            addCriterionForJDBCDate("start_duration2 >", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration2 >=", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2LessThan(Date value) {
            addCriterionForJDBCDate("start_duration2 <", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_duration2 <=", value, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2In(List<Date> values) {
            addCriterionForJDBCDate("start_duration2 in", values, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2NotIn(List<Date> values) {
            addCriterionForJDBCDate("start_duration2 not in", values, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("start_duration2 between", value1, value2, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andStartDuration2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_duration2 not between", value1, value2, "startDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2IsNull() {
            addCriterion("end_duration2 is null");
            return (Criteria) this;
        }

        public Criteria andEndDuration2IsNotNull() {
            addCriterion("end_duration2 is not null");
            return (Criteria) this;
        }

        public Criteria andEndDuration2EqualTo(Date value) {
            addCriterionForJDBCDate("end_duration2 =", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2NotEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration2 <>", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2GreaterThan(Date value) {
            addCriterionForJDBCDate("end_duration2 >", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration2 >=", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2LessThan(Date value) {
            addCriterionForJDBCDate("end_duration2 <", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_duration2 <=", value, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2In(List<Date> values) {
            addCriterionForJDBCDate("end_duration2 in", values, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2NotIn(List<Date> values) {
            addCriterionForJDBCDate("end_duration2 not in", values, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("end_duration2 between", value1, value2, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andEndDuration2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_duration2 not between", value1, value2, "endDuration2");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceIsNull() {
            addCriterion("gender_preference is null");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceIsNotNull() {
            addCriterion("gender_preference is not null");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceEqualTo(Integer value) {
            addCriterion("gender_preference =", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceNotEqualTo(Integer value) {
            addCriterion("gender_preference <>", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceGreaterThan(Integer value) {
            addCriterion("gender_preference >", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender_preference >=", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceLessThan(Integer value) {
            addCriterion("gender_preference <", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("gender_preference <=", value, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceIn(List<Integer> values) {
            addCriterion("gender_preference in", values, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceNotIn(List<Integer> values) {
            addCriterion("gender_preference not in", values, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("gender_preference between", value1, value2, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andGenderPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("gender_preference not between", value1, value2, "genderPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceIsNull() {
            addCriterion("rating_preference is null");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceIsNotNull() {
            addCriterion("rating_preference is not null");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceEqualTo(Integer value) {
            addCriterion("rating_preference =", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceNotEqualTo(Integer value) {
            addCriterion("rating_preference <>", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceGreaterThan(Integer value) {
            addCriterion("rating_preference >", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating_preference >=", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceLessThan(Integer value) {
            addCriterion("rating_preference <", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("rating_preference <=", value, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceIn(List<Integer> values) {
            addCriterion("rating_preference in", values, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceNotIn(List<Integer> values) {
            addCriterion("rating_preference not in", values, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("rating_preference between", value1, value2, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andRatingPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("rating_preference not between", value1, value2, "ratingPreference");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIsNull() {
            addCriterion("commute_type is null");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIsNotNull() {
            addCriterion("commute_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeEqualTo(Integer value) {
            addCriterion("commute_type =", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotEqualTo(Integer value) {
            addCriterion("commute_type <>", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeGreaterThan(Integer value) {
            addCriterion("commute_type >", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commute_type >=", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeLessThan(Integer value) {
            addCriterion("commute_type <", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("commute_type <=", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIn(List<Integer> values) {
            addCriterion("commute_type in", values, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotIn(List<Integer> values) {
            addCriterion("commute_type not in", values, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeBetween(Integer value1, Integer value2) {
            addCriterion("commute_type between", value1, value2, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("commute_type not between", value1, value2, "commuteType");
            return (Criteria) this;
        }

        public Criteria andEngageTimeIsNull() {
            addCriterion("engage_time is null");
            return (Criteria) this;
        }

        public Criteria andEngageTimeIsNotNull() {
            addCriterion("engage_time is not null");
            return (Criteria) this;
        }

        public Criteria andEngageTimeEqualTo(Date value) {
            addCriterion("engage_time =", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeNotEqualTo(Date value) {
            addCriterion("engage_time <>", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeGreaterThan(Date value) {
            addCriterion("engage_time >", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("engage_time >=", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeLessThan(Date value) {
            addCriterion("engage_time <", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeLessThanOrEqualTo(Date value) {
            addCriterion("engage_time <=", value, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeIn(List<Date> values) {
            addCriterion("engage_time in", values, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeNotIn(List<Date> values) {
            addCriterion("engage_time not in", values, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeBetween(Date value1, Date value2) {
            addCriterion("engage_time between", value1, value2, "engageTime");
            return (Criteria) this;
        }

        public Criteria andEngageTimeNotBetween(Date value1, Date value2) {
            addCriterion("engage_time not between", value1, value2, "engageTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCurrentServerIsNull() {
            addCriterion("current_server is null");
            return (Criteria) this;
        }

        public Criteria andCurrentServerIsNotNull() {
            addCriterion("current_server is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentServerEqualTo(String value) {
            addCriterion("current_server =", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerNotEqualTo(String value) {
            addCriterion("current_server <>", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerGreaterThan(String value) {
            addCriterion("current_server >", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerGreaterThanOrEqualTo(String value) {
            addCriterion("current_server >=", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerLessThan(String value) {
            addCriterion("current_server <", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerLessThanOrEqualTo(String value) {
            addCriterion("current_server <=", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerLike(String value) {
            addCriterion("current_server like", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerNotLike(String value) {
            addCriterion("current_server not like", value, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerIn(List<String> values) {
            addCriterion("current_server in", values, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerNotIn(List<String> values) {
            addCriterion("current_server not in", values, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerBetween(String value1, String value2) {
            addCriterion("current_server between", value1, value2, "currentServer");
            return (Criteria) this;
        }

        public Criteria andCurrentServerNotBetween(String value1, String value2) {
            addCriterion("current_server not between", value1, value2, "currentServer");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeIsNull() {
            addCriterion("schedule_date_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeIsNotNull() {
            addCriterion("schedule_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeEqualTo(String value) {
            addCriterion("schedule_date_time =", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeNotEqualTo(String value) {
            addCriterion("schedule_date_time <>", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeGreaterThan(String value) {
            addCriterion("schedule_date_time >", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_date_time >=", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeLessThan(String value) {
            addCriterion("schedule_date_time <", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeLessThanOrEqualTo(String value) {
            addCriterion("schedule_date_time <=", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeLike(String value) {
            addCriterion("schedule_date_time like", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeNotLike(String value) {
            addCriterion("schedule_date_time not like", value, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeIn(List<String> values) {
            addCriterion("schedule_date_time in", values, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeNotIn(List<String> values) {
            addCriterion("schedule_date_time not in", values, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeBetween(String value1, String value2) {
            addCriterion("schedule_date_time between", value1, value2, "scheduleDateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDateTimeNotBetween(String value1, String value2) {
            addCriterion("schedule_date_time not between", value1, value2, "scheduleDateTime");
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