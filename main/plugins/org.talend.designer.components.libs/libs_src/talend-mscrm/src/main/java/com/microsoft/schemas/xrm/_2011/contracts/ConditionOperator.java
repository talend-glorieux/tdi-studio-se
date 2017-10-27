/*
 * XML Type:  ConditionOperator
 * Namespace: http://schemas.microsoft.com/xrm/2011/Contracts
 * Java type: com.microsoft.schemas.xrm._2011.contracts.ConditionOperator
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.xrm._2011.contracts;


/**
 * An XML ConditionOperator(@http://schemas.microsoft.com/xrm/2011/Contracts).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.
 */
public interface ConditionOperator extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConditionOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EBB4BC9E00A8FB74293D27D6A5BA466").resolveHandle("conditionoperatorbd7etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EQUAL = Enum.forString("Equal");
    static final Enum NOT_EQUAL = Enum.forString("NotEqual");
    static final Enum GREATER_THAN = Enum.forString("GreaterThan");
    static final Enum LESS_THAN = Enum.forString("LessThan");
    static final Enum GREATER_EQUAL = Enum.forString("GreaterEqual");
    static final Enum LESS_EQUAL = Enum.forString("LessEqual");
    static final Enum LIKE = Enum.forString("Like");
    static final Enum NOT_LIKE = Enum.forString("NotLike");
    static final Enum IN = Enum.forString("In");
    static final Enum NOT_IN = Enum.forString("NotIn");
    static final Enum BETWEEN = Enum.forString("Between");
    static final Enum NOT_BETWEEN = Enum.forString("NotBetween");
    static final Enum NULL = Enum.forString("Null");
    static final Enum NOT_NULL = Enum.forString("NotNull");
    static final Enum YESTERDAY = Enum.forString("Yesterday");
    static final Enum TODAY = Enum.forString("Today");
    static final Enum TOMORROW = Enum.forString("Tomorrow");
    static final Enum LAST_7_DAYS = Enum.forString("Last7Days");
    static final Enum NEXT_7_DAYS = Enum.forString("Next7Days");
    static final Enum LAST_WEEK = Enum.forString("LastWeek");
    static final Enum THIS_WEEK = Enum.forString("ThisWeek");
    static final Enum NEXT_WEEK = Enum.forString("NextWeek");
    static final Enum LAST_MONTH = Enum.forString("LastMonth");
    static final Enum THIS_MONTH = Enum.forString("ThisMonth");
    static final Enum NEXT_MONTH = Enum.forString("NextMonth");
    static final Enum ON = Enum.forString("On");
    static final Enum ON_OR_BEFORE = Enum.forString("OnOrBefore");
    static final Enum ON_OR_AFTER = Enum.forString("OnOrAfter");
    static final Enum LAST_YEAR = Enum.forString("LastYear");
    static final Enum THIS_YEAR = Enum.forString("ThisYear");
    static final Enum NEXT_YEAR = Enum.forString("NextYear");
    static final Enum LAST_X_HOURS = Enum.forString("LastXHours");
    static final Enum NEXT_X_HOURS = Enum.forString("NextXHours");
    static final Enum LAST_X_DAYS = Enum.forString("LastXDays");
    static final Enum NEXT_X_DAYS = Enum.forString("NextXDays");
    static final Enum LAST_X_WEEKS = Enum.forString("LastXWeeks");
    static final Enum NEXT_X_WEEKS = Enum.forString("NextXWeeks");
    static final Enum LAST_X_MONTHS = Enum.forString("LastXMonths");
    static final Enum NEXT_X_MONTHS = Enum.forString("NextXMonths");
    static final Enum LAST_X_YEARS = Enum.forString("LastXYears");
    static final Enum NEXT_X_YEARS = Enum.forString("NextXYears");
    static final Enum EQUAL_USER_ID = Enum.forString("EqualUserId");
    static final Enum NOT_EQUAL_USER_ID = Enum.forString("NotEqualUserId");
    static final Enum EQUAL_BUSINESS_ID = Enum.forString("EqualBusinessId");
    static final Enum NOT_EQUAL_BUSINESS_ID = Enum.forString("NotEqualBusinessId");
    static final Enum CHILD_OF = Enum.forString("ChildOf");
    static final Enum MASK = Enum.forString("Mask");
    static final Enum NOT_MASK = Enum.forString("NotMask");
    static final Enum MASKS_SELECT = Enum.forString("MasksSelect");
    static final Enum CONTAINS = Enum.forString("Contains");
    static final Enum DOES_NOT_CONTAIN = Enum.forString("DoesNotContain");
    static final Enum EQUAL_USER_LANGUAGE = Enum.forString("EqualUserLanguage");
    static final Enum NOT_ON = Enum.forString("NotOn");
    static final Enum OLDER_THAN_X_MONTHS = Enum.forString("OlderThanXMonths");
    static final Enum BEGINS_WITH = Enum.forString("BeginsWith");
    static final Enum DOES_NOT_BEGIN_WITH = Enum.forString("DoesNotBeginWith");
    static final Enum ENDS_WITH = Enum.forString("EndsWith");
    static final Enum DOES_NOT_END_WITH = Enum.forString("DoesNotEndWith");
    static final Enum THIS_FISCAL_YEAR = Enum.forString("ThisFiscalYear");
    static final Enum THIS_FISCAL_PERIOD = Enum.forString("ThisFiscalPeriod");
    static final Enum NEXT_FISCAL_YEAR = Enum.forString("NextFiscalYear");
    static final Enum NEXT_FISCAL_PERIOD = Enum.forString("NextFiscalPeriod");
    static final Enum LAST_FISCAL_YEAR = Enum.forString("LastFiscalYear");
    static final Enum LAST_FISCAL_PERIOD = Enum.forString("LastFiscalPeriod");
    static final Enum LAST_X_FISCAL_YEARS = Enum.forString("LastXFiscalYears");
    static final Enum LAST_X_FISCAL_PERIODS = Enum.forString("LastXFiscalPeriods");
    static final Enum NEXT_X_FISCAL_YEARS = Enum.forString("NextXFiscalYears");
    static final Enum NEXT_X_FISCAL_PERIODS = Enum.forString("NextXFiscalPeriods");
    static final Enum IN_FISCAL_YEAR = Enum.forString("InFiscalYear");
    static final Enum IN_FISCAL_PERIOD = Enum.forString("InFiscalPeriod");
    static final Enum IN_FISCAL_PERIOD_AND_YEAR = Enum.forString("InFiscalPeriodAndYear");
    static final Enum IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR = Enum.forString("InOrBeforeFiscalPeriodAndYear");
    static final Enum IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR = Enum.forString("InOrAfterFiscalPeriodAndYear");
    static final Enum EQUAL_USER_TEAMS = Enum.forString("EqualUserTeams");
    static final Enum EQUAL_USER_OR_USER_TEAMS = Enum.forString("EqualUserOrUserTeams");
    static final Enum UNDER = Enum.forString("Under");
    static final Enum NOT_UNDER = Enum.forString("NotUnder");
    static final Enum UNDER_OR_EQUAL = Enum.forString("UnderOrEqual");
    static final Enum ABOVE = Enum.forString("Above");
    static final Enum ABOVE_OR_EQUAL = Enum.forString("AboveOrEqual");
    static final Enum EQUAL_USER_OR_USER_HIERARCHY = Enum.forString("EqualUserOrUserHierarchy");
    static final Enum EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS = Enum.forString("EqualUserOrUserHierarchyAndTeams");
    static final Enum OLDER_THAN_X_YEARS = Enum.forString("OlderThanXYears");
    static final Enum OLDER_THAN_X_WEEKS = Enum.forString("OlderThanXWeeks");
    static final Enum OLDER_THAN_X_DAYS = Enum.forString("OlderThanXDays");
    static final Enum OLDER_THAN_X_HOURS = Enum.forString("OlderThanXHours");
    static final Enum OLDER_THAN_X_MINUTES = Enum.forString("OlderThanXMinutes");
    
    static final int INT_EQUAL = Enum.INT_EQUAL;
    static final int INT_NOT_EQUAL = Enum.INT_NOT_EQUAL;
    static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
    static final int INT_GREATER_EQUAL = Enum.INT_GREATER_EQUAL;
    static final int INT_LESS_EQUAL = Enum.INT_LESS_EQUAL;
    static final int INT_LIKE = Enum.INT_LIKE;
    static final int INT_NOT_LIKE = Enum.INT_NOT_LIKE;
    static final int INT_IN = Enum.INT_IN;
    static final int INT_NOT_IN = Enum.INT_NOT_IN;
    static final int INT_BETWEEN = Enum.INT_BETWEEN;
    static final int INT_NOT_BETWEEN = Enum.INT_NOT_BETWEEN;
    static final int INT_NULL = Enum.INT_NULL;
    static final int INT_NOT_NULL = Enum.INT_NOT_NULL;
    static final int INT_YESTERDAY = Enum.INT_YESTERDAY;
    static final int INT_TODAY = Enum.INT_TODAY;
    static final int INT_TOMORROW = Enum.INT_TOMORROW;
    static final int INT_LAST_7_DAYS = Enum.INT_LAST_7_DAYS;
    static final int INT_NEXT_7_DAYS = Enum.INT_NEXT_7_DAYS;
    static final int INT_LAST_WEEK = Enum.INT_LAST_WEEK;
    static final int INT_THIS_WEEK = Enum.INT_THIS_WEEK;
    static final int INT_NEXT_WEEK = Enum.INT_NEXT_WEEK;
    static final int INT_LAST_MONTH = Enum.INT_LAST_MONTH;
    static final int INT_THIS_MONTH = Enum.INT_THIS_MONTH;
    static final int INT_NEXT_MONTH = Enum.INT_NEXT_MONTH;
    static final int INT_ON = Enum.INT_ON;
    static final int INT_ON_OR_BEFORE = Enum.INT_ON_OR_BEFORE;
    static final int INT_ON_OR_AFTER = Enum.INT_ON_OR_AFTER;
    static final int INT_LAST_YEAR = Enum.INT_LAST_YEAR;
    static final int INT_THIS_YEAR = Enum.INT_THIS_YEAR;
    static final int INT_NEXT_YEAR = Enum.INT_NEXT_YEAR;
    static final int INT_LAST_X_HOURS = Enum.INT_LAST_X_HOURS;
    static final int INT_NEXT_X_HOURS = Enum.INT_NEXT_X_HOURS;
    static final int INT_LAST_X_DAYS = Enum.INT_LAST_X_DAYS;
    static final int INT_NEXT_X_DAYS = Enum.INT_NEXT_X_DAYS;
    static final int INT_LAST_X_WEEKS = Enum.INT_LAST_X_WEEKS;
    static final int INT_NEXT_X_WEEKS = Enum.INT_NEXT_X_WEEKS;
    static final int INT_LAST_X_MONTHS = Enum.INT_LAST_X_MONTHS;
    static final int INT_NEXT_X_MONTHS = Enum.INT_NEXT_X_MONTHS;
    static final int INT_LAST_X_YEARS = Enum.INT_LAST_X_YEARS;
    static final int INT_NEXT_X_YEARS = Enum.INT_NEXT_X_YEARS;
    static final int INT_EQUAL_USER_ID = Enum.INT_EQUAL_USER_ID;
    static final int INT_NOT_EQUAL_USER_ID = Enum.INT_NOT_EQUAL_USER_ID;
    static final int INT_EQUAL_BUSINESS_ID = Enum.INT_EQUAL_BUSINESS_ID;
    static final int INT_NOT_EQUAL_BUSINESS_ID = Enum.INT_NOT_EQUAL_BUSINESS_ID;
    static final int INT_CHILD_OF = Enum.INT_CHILD_OF;
    static final int INT_MASK = Enum.INT_MASK;
    static final int INT_NOT_MASK = Enum.INT_NOT_MASK;
    static final int INT_MASKS_SELECT = Enum.INT_MASKS_SELECT;
    static final int INT_CONTAINS = Enum.INT_CONTAINS;
    static final int INT_DOES_NOT_CONTAIN = Enum.INT_DOES_NOT_CONTAIN;
    static final int INT_EQUAL_USER_LANGUAGE = Enum.INT_EQUAL_USER_LANGUAGE;
    static final int INT_NOT_ON = Enum.INT_NOT_ON;
    static final int INT_OLDER_THAN_X_MONTHS = Enum.INT_OLDER_THAN_X_MONTHS;
    static final int INT_BEGINS_WITH = Enum.INT_BEGINS_WITH;
    static final int INT_DOES_NOT_BEGIN_WITH = Enum.INT_DOES_NOT_BEGIN_WITH;
    static final int INT_ENDS_WITH = Enum.INT_ENDS_WITH;
    static final int INT_DOES_NOT_END_WITH = Enum.INT_DOES_NOT_END_WITH;
    static final int INT_THIS_FISCAL_YEAR = Enum.INT_THIS_FISCAL_YEAR;
    static final int INT_THIS_FISCAL_PERIOD = Enum.INT_THIS_FISCAL_PERIOD;
    static final int INT_NEXT_FISCAL_YEAR = Enum.INT_NEXT_FISCAL_YEAR;
    static final int INT_NEXT_FISCAL_PERIOD = Enum.INT_NEXT_FISCAL_PERIOD;
    static final int INT_LAST_FISCAL_YEAR = Enum.INT_LAST_FISCAL_YEAR;
    static final int INT_LAST_FISCAL_PERIOD = Enum.INT_LAST_FISCAL_PERIOD;
    static final int INT_LAST_X_FISCAL_YEARS = Enum.INT_LAST_X_FISCAL_YEARS;
    static final int INT_LAST_X_FISCAL_PERIODS = Enum.INT_LAST_X_FISCAL_PERIODS;
    static final int INT_NEXT_X_FISCAL_YEARS = Enum.INT_NEXT_X_FISCAL_YEARS;
    static final int INT_NEXT_X_FISCAL_PERIODS = Enum.INT_NEXT_X_FISCAL_PERIODS;
    static final int INT_IN_FISCAL_YEAR = Enum.INT_IN_FISCAL_YEAR;
    static final int INT_IN_FISCAL_PERIOD = Enum.INT_IN_FISCAL_PERIOD;
    static final int INT_IN_FISCAL_PERIOD_AND_YEAR = Enum.INT_IN_FISCAL_PERIOD_AND_YEAR;
    static final int INT_IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR = Enum.INT_IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR;
    static final int INT_IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR = Enum.INT_IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR;
    static final int INT_EQUAL_USER_TEAMS = Enum.INT_EQUAL_USER_TEAMS;
    static final int INT_EQUAL_USER_OR_USER_TEAMS = Enum.INT_EQUAL_USER_OR_USER_TEAMS;
    static final int INT_UNDER = Enum.INT_UNDER;
    static final int INT_NOT_UNDER = Enum.INT_NOT_UNDER;
    static final int INT_UNDER_OR_EQUAL = Enum.INT_UNDER_OR_EQUAL;
    static final int INT_ABOVE = Enum.INT_ABOVE;
    static final int INT_ABOVE_OR_EQUAL = Enum.INT_ABOVE_OR_EQUAL;
    static final int INT_EQUAL_USER_OR_USER_HIERARCHY = Enum.INT_EQUAL_USER_OR_USER_HIERARCHY;
    static final int INT_EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS = Enum.INT_EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS;
    static final int INT_OLDER_THAN_X_YEARS = Enum.INT_OLDER_THAN_X_YEARS;
    static final int INT_OLDER_THAN_X_WEEKS = Enum.INT_OLDER_THAN_X_WEEKS;
    static final int INT_OLDER_THAN_X_DAYS = Enum.INT_OLDER_THAN_X_DAYS;
    static final int INT_OLDER_THAN_X_HOURS = Enum.INT_OLDER_THAN_X_HOURS;
    static final int INT_OLDER_THAN_X_MINUTES = Enum.INT_OLDER_THAN_X_MINUTES;
    
    /**
     * Enumeration value class for com.microsoft.schemas.xrm._2011.contracts.ConditionOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EQUAL
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_EQUAL = 1;
        static final int INT_NOT_EQUAL = 2;
        static final int INT_GREATER_THAN = 3;
        static final int INT_LESS_THAN = 4;
        static final int INT_GREATER_EQUAL = 5;
        static final int INT_LESS_EQUAL = 6;
        static final int INT_LIKE = 7;
        static final int INT_NOT_LIKE = 8;
        static final int INT_IN = 9;
        static final int INT_NOT_IN = 10;
        static final int INT_BETWEEN = 11;
        static final int INT_NOT_BETWEEN = 12;
        static final int INT_NULL = 13;
        static final int INT_NOT_NULL = 14;
        static final int INT_YESTERDAY = 15;
        static final int INT_TODAY = 16;
        static final int INT_TOMORROW = 17;
        static final int INT_LAST_7_DAYS = 18;
        static final int INT_NEXT_7_DAYS = 19;
        static final int INT_LAST_WEEK = 20;
        static final int INT_THIS_WEEK = 21;
        static final int INT_NEXT_WEEK = 22;
        static final int INT_LAST_MONTH = 23;
        static final int INT_THIS_MONTH = 24;
        static final int INT_NEXT_MONTH = 25;
        static final int INT_ON = 26;
        static final int INT_ON_OR_BEFORE = 27;
        static final int INT_ON_OR_AFTER = 28;
        static final int INT_LAST_YEAR = 29;
        static final int INT_THIS_YEAR = 30;
        static final int INT_NEXT_YEAR = 31;
        static final int INT_LAST_X_HOURS = 32;
        static final int INT_NEXT_X_HOURS = 33;
        static final int INT_LAST_X_DAYS = 34;
        static final int INT_NEXT_X_DAYS = 35;
        static final int INT_LAST_X_WEEKS = 36;
        static final int INT_NEXT_X_WEEKS = 37;
        static final int INT_LAST_X_MONTHS = 38;
        static final int INT_NEXT_X_MONTHS = 39;
        static final int INT_LAST_X_YEARS = 40;
        static final int INT_NEXT_X_YEARS = 41;
        static final int INT_EQUAL_USER_ID = 42;
        static final int INT_NOT_EQUAL_USER_ID = 43;
        static final int INT_EQUAL_BUSINESS_ID = 44;
        static final int INT_NOT_EQUAL_BUSINESS_ID = 45;
        static final int INT_CHILD_OF = 46;
        static final int INT_MASK = 47;
        static final int INT_NOT_MASK = 48;
        static final int INT_MASKS_SELECT = 49;
        static final int INT_CONTAINS = 50;
        static final int INT_DOES_NOT_CONTAIN = 51;
        static final int INT_EQUAL_USER_LANGUAGE = 52;
        static final int INT_NOT_ON = 53;
        static final int INT_OLDER_THAN_X_MONTHS = 54;
        static final int INT_BEGINS_WITH = 55;
        static final int INT_DOES_NOT_BEGIN_WITH = 56;
        static final int INT_ENDS_WITH = 57;
        static final int INT_DOES_NOT_END_WITH = 58;
        static final int INT_THIS_FISCAL_YEAR = 59;
        static final int INT_THIS_FISCAL_PERIOD = 60;
        static final int INT_NEXT_FISCAL_YEAR = 61;
        static final int INT_NEXT_FISCAL_PERIOD = 62;
        static final int INT_LAST_FISCAL_YEAR = 63;
        static final int INT_LAST_FISCAL_PERIOD = 64;
        static final int INT_LAST_X_FISCAL_YEARS = 65;
        static final int INT_LAST_X_FISCAL_PERIODS = 66;
        static final int INT_NEXT_X_FISCAL_YEARS = 67;
        static final int INT_NEXT_X_FISCAL_PERIODS = 68;
        static final int INT_IN_FISCAL_YEAR = 69;
        static final int INT_IN_FISCAL_PERIOD = 70;
        static final int INT_IN_FISCAL_PERIOD_AND_YEAR = 71;
        static final int INT_IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR = 72;
        static final int INT_IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR = 73;
        static final int INT_EQUAL_USER_TEAMS = 74;
        static final int INT_EQUAL_USER_OR_USER_TEAMS = 75;
        static final int INT_UNDER = 76;
        static final int INT_NOT_UNDER = 77;
        static final int INT_UNDER_OR_EQUAL = 78;
        static final int INT_ABOVE = 79;
        static final int INT_ABOVE_OR_EQUAL = 80;
        static final int INT_EQUAL_USER_OR_USER_HIERARCHY = 81;
        static final int INT_EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS = 82;
        static final int INT_OLDER_THAN_X_YEARS = 83;
        static final int INT_OLDER_THAN_X_WEEKS = 84;
        static final int INT_OLDER_THAN_X_DAYS = 85;
        static final int INT_OLDER_THAN_X_HOURS = 86;
        static final int INT_OLDER_THAN_X_MINUTES = 87;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Equal", INT_EQUAL),
                new Enum("NotEqual", INT_NOT_EQUAL),
                new Enum("GreaterThan", INT_GREATER_THAN),
                new Enum("LessThan", INT_LESS_THAN),
                new Enum("GreaterEqual", INT_GREATER_EQUAL),
                new Enum("LessEqual", INT_LESS_EQUAL),
                new Enum("Like", INT_LIKE),
                new Enum("NotLike", INT_NOT_LIKE),
                new Enum("In", INT_IN),
                new Enum("NotIn", INT_NOT_IN),
                new Enum("Between", INT_BETWEEN),
                new Enum("NotBetween", INT_NOT_BETWEEN),
                new Enum("Null", INT_NULL),
                new Enum("NotNull", INT_NOT_NULL),
                new Enum("Yesterday", INT_YESTERDAY),
                new Enum("Today", INT_TODAY),
                new Enum("Tomorrow", INT_TOMORROW),
                new Enum("Last7Days", INT_LAST_7_DAYS),
                new Enum("Next7Days", INT_NEXT_7_DAYS),
                new Enum("LastWeek", INT_LAST_WEEK),
                new Enum("ThisWeek", INT_THIS_WEEK),
                new Enum("NextWeek", INT_NEXT_WEEK),
                new Enum("LastMonth", INT_LAST_MONTH),
                new Enum("ThisMonth", INT_THIS_MONTH),
                new Enum("NextMonth", INT_NEXT_MONTH),
                new Enum("On", INT_ON),
                new Enum("OnOrBefore", INT_ON_OR_BEFORE),
                new Enum("OnOrAfter", INT_ON_OR_AFTER),
                new Enum("LastYear", INT_LAST_YEAR),
                new Enum("ThisYear", INT_THIS_YEAR),
                new Enum("NextYear", INT_NEXT_YEAR),
                new Enum("LastXHours", INT_LAST_X_HOURS),
                new Enum("NextXHours", INT_NEXT_X_HOURS),
                new Enum("LastXDays", INT_LAST_X_DAYS),
                new Enum("NextXDays", INT_NEXT_X_DAYS),
                new Enum("LastXWeeks", INT_LAST_X_WEEKS),
                new Enum("NextXWeeks", INT_NEXT_X_WEEKS),
                new Enum("LastXMonths", INT_LAST_X_MONTHS),
                new Enum("NextXMonths", INT_NEXT_X_MONTHS),
                new Enum("LastXYears", INT_LAST_X_YEARS),
                new Enum("NextXYears", INT_NEXT_X_YEARS),
                new Enum("EqualUserId", INT_EQUAL_USER_ID),
                new Enum("NotEqualUserId", INT_NOT_EQUAL_USER_ID),
                new Enum("EqualBusinessId", INT_EQUAL_BUSINESS_ID),
                new Enum("NotEqualBusinessId", INT_NOT_EQUAL_BUSINESS_ID),
                new Enum("ChildOf", INT_CHILD_OF),
                new Enum("Mask", INT_MASK),
                new Enum("NotMask", INT_NOT_MASK),
                new Enum("MasksSelect", INT_MASKS_SELECT),
                new Enum("Contains", INT_CONTAINS),
                new Enum("DoesNotContain", INT_DOES_NOT_CONTAIN),
                new Enum("EqualUserLanguage", INT_EQUAL_USER_LANGUAGE),
                new Enum("NotOn", INT_NOT_ON),
                new Enum("OlderThanXMonths", INT_OLDER_THAN_X_MONTHS),
                new Enum("BeginsWith", INT_BEGINS_WITH),
                new Enum("DoesNotBeginWith", INT_DOES_NOT_BEGIN_WITH),
                new Enum("EndsWith", INT_ENDS_WITH),
                new Enum("DoesNotEndWith", INT_DOES_NOT_END_WITH),
                new Enum("ThisFiscalYear", INT_THIS_FISCAL_YEAR),
                new Enum("ThisFiscalPeriod", INT_THIS_FISCAL_PERIOD),
                new Enum("NextFiscalYear", INT_NEXT_FISCAL_YEAR),
                new Enum("NextFiscalPeriod", INT_NEXT_FISCAL_PERIOD),
                new Enum("LastFiscalYear", INT_LAST_FISCAL_YEAR),
                new Enum("LastFiscalPeriod", INT_LAST_FISCAL_PERIOD),
                new Enum("LastXFiscalYears", INT_LAST_X_FISCAL_YEARS),
                new Enum("LastXFiscalPeriods", INT_LAST_X_FISCAL_PERIODS),
                new Enum("NextXFiscalYears", INT_NEXT_X_FISCAL_YEARS),
                new Enum("NextXFiscalPeriods", INT_NEXT_X_FISCAL_PERIODS),
                new Enum("InFiscalYear", INT_IN_FISCAL_YEAR),
                new Enum("InFiscalPeriod", INT_IN_FISCAL_PERIOD),
                new Enum("InFiscalPeriodAndYear", INT_IN_FISCAL_PERIOD_AND_YEAR),
                new Enum("InOrBeforeFiscalPeriodAndYear", INT_IN_OR_BEFORE_FISCAL_PERIOD_AND_YEAR),
                new Enum("InOrAfterFiscalPeriodAndYear", INT_IN_OR_AFTER_FISCAL_PERIOD_AND_YEAR),
                new Enum("EqualUserTeams", INT_EQUAL_USER_TEAMS),
                new Enum("EqualUserOrUserTeams", INT_EQUAL_USER_OR_USER_TEAMS),
                new Enum("Under", INT_UNDER),
                new Enum("NotUnder", INT_NOT_UNDER),
                new Enum("UnderOrEqual", INT_UNDER_OR_EQUAL),
                new Enum("Above", INT_ABOVE),
                new Enum("AboveOrEqual", INT_ABOVE_OR_EQUAL),
                new Enum("EqualUserOrUserHierarchy", INT_EQUAL_USER_OR_USER_HIERARCHY),
                new Enum("EqualUserOrUserHierarchyAndTeams", INT_EQUAL_USER_OR_USER_HIERARCHY_AND_TEAMS),
                new Enum("OlderThanXYears", INT_OLDER_THAN_X_YEARS),
                new Enum("OlderThanXWeeks", INT_OLDER_THAN_X_WEEKS),
                new Enum("OlderThanXDays", INT_OLDER_THAN_X_DAYS),
                new Enum("OlderThanXHours", INT_OLDER_THAN_X_HOURS),
                new Enum("OlderThanXMinutes", INT_OLDER_THAN_X_MINUTES),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) type.newValue( obj ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator newInstance() {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.xrm._2011.contracts.ConditionOperator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.xrm._2011.contracts.ConditionOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
