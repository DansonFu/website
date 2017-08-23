package cn.lanson.pojo;

import java.util.ArrayList;
import java.util.List;

public class PicListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicListExample() {
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

        public Criteria andPicListIdIsNull() {
            addCriterion("pic_list_id is null");
            return (Criteria) this;
        }

        public Criteria andPicListIdIsNotNull() {
            addCriterion("pic_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicListIdEqualTo(Integer value) {
            addCriterion("pic_list_id =", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdNotEqualTo(Integer value) {
            addCriterion("pic_list_id <>", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdGreaterThan(Integer value) {
            addCriterion("pic_list_id >", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_list_id >=", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdLessThan(Integer value) {
            addCriterion("pic_list_id <", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdLessThanOrEqualTo(Integer value) {
            addCriterion("pic_list_id <=", value, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdIn(List<Integer> values) {
            addCriterion("pic_list_id in", values, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdNotIn(List<Integer> values) {
            addCriterion("pic_list_id not in", values, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdBetween(Integer value1, Integer value2) {
            addCriterion("pic_list_id between", value1, value2, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_list_id not between", value1, value2, "picListId");
            return (Criteria) this;
        }

        public Criteria andPicListNameIsNull() {
            addCriterion("pic_list_name is null");
            return (Criteria) this;
        }

        public Criteria andPicListNameIsNotNull() {
            addCriterion("pic_list_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicListNameEqualTo(String value) {
            addCriterion("pic_list_name =", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameNotEqualTo(String value) {
            addCriterion("pic_list_name <>", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameGreaterThan(String value) {
            addCriterion("pic_list_name >", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_list_name >=", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameLessThan(String value) {
            addCriterion("pic_list_name <", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameLessThanOrEqualTo(String value) {
            addCriterion("pic_list_name <=", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameLike(String value) {
            addCriterion("pic_list_name like", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameNotLike(String value) {
            addCriterion("pic_list_name not like", value, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameIn(List<String> values) {
            addCriterion("pic_list_name in", values, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameNotIn(List<String> values) {
            addCriterion("pic_list_name not in", values, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameBetween(String value1, String value2) {
            addCriterion("pic_list_name between", value1, value2, "picListName");
            return (Criteria) this;
        }

        public Criteria andPicListNameNotBetween(String value1, String value2) {
            addCriterion("pic_list_name not between", value1, value2, "picListName");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNull() {
            addCriterion("cover_pic is null");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNotNull() {
            addCriterion("cover_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPicEqualTo(String value) {
            addCriterion("cover_pic =", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotEqualTo(String value) {
            addCriterion("cover_pic <>", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThan(String value) {
            addCriterion("cover_pic >", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThanOrEqualTo(String value) {
            addCriterion("cover_pic >=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThan(String value) {
            addCriterion("cover_pic <", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThanOrEqualTo(String value) {
            addCriterion("cover_pic <=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLike(String value) {
            addCriterion("cover_pic like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotLike(String value) {
            addCriterion("cover_pic not like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicIn(List<String> values) {
            addCriterion("cover_pic in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotIn(List<String> values) {
            addCriterion("cover_pic not in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicBetween(String value1, String value2) {
            addCriterion("cover_pic between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotBetween(String value1, String value2) {
            addCriterion("cover_pic not between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
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