package cn.edu.hbpu.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class TwocategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwocategoryExample() {
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

        public Criteria andTcidIsNull() {
            addCriterion("tcid is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcid is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(Integer value) {
            addCriterion("tcid =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(Integer value) {
            addCriterion("tcid <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(Integer value) {
            addCriterion("tcid >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcid >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(Integer value) {
            addCriterion("tcid <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(Integer value) {
            addCriterion("tcid <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<Integer> values) {
            addCriterion("tcid in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<Integer> values) {
            addCriterion("tcid not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(Integer value1, Integer value2) {
            addCriterion("tcid between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tcid not between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNull() {
            addCriterion("tcname is null");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNotNull() {
            addCriterion("tcname is not null");
            return (Criteria) this;
        }

        public Criteria andTcnameEqualTo(String value) {
            addCriterion("tcname =", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotEqualTo(String value) {
            addCriterion("tcname <>", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThan(String value) {
            addCriterion("tcname >", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThanOrEqualTo(String value) {
            addCriterion("tcname >=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThan(String value) {
            addCriterion("tcname <", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThanOrEqualTo(String value) {
            addCriterion("tcname <=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLike(String value) {
            addCriterion("tcname like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotLike(String value) {
            addCriterion("tcname not like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameIn(List<String> values) {
            addCriterion("tcname in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotIn(List<String> values) {
            addCriterion("tcname not in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameBetween(String value1, String value2) {
            addCriterion("tcname between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotBetween(String value1, String value2) {
            addCriterion("tcname not between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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