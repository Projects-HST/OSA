package com.hst.osa.utils;

public class OSAConstants {

    public static final String BASE_URL = "https://happysanztech.com/";

    public static final String JOINT_URL = "shopping/";

    public static final String BUILD_URL = BASE_URL + JOINT_URL + "mobileapi/";


    //Payment Gateway
    public static final String API_ADVANCE_PAYMENT_URL = BASE_URL + JOINT_URL + "ccavenue_app/customer_advance.php";
    //    public static final String API_ADVANCE_PAYMENT_URL = BASE_URL + JOINT_URL + "ccavenue_app/ccavResponseHandler.php";
    public static final String API_PAYMENT_URL = BASE_URL + JOINT_URL + "ccavenue_app/service_net_amount.php";
    public static final String API_WALLET_URL = BASE_URL + JOINT_URL + "ccavenue_app/adding_money_to_wallet.php";
    public static final String API_RSA_URL = BASE_URL + JOINT_URL + "ccavenue_app/GetRSA.php";
    public static final String SUCCESSFUL_PAYMENT = BASE_URL + JOINT_URL + "";


    public static final String FB_GPLUS_LOGIN = "socialLogin/";

    public static final String MOBILE_VERIFY = "login_mobile/";

    public static final String NUMBER_LOGIN = "login_mobileotp/";

    public static final String EMAIL_LOGIN = "login/";

    public static final String DASHBOARD = "home_page/";

    public static final String SUB_CATEGORY_LIST = "sub_cat_list/";

    public static final String PRODUCT_LIST = "product_list/";

    public static final String PRODUCT_DETAIL = "product_details/";

    public static final String GET_PRODUCT_SIZE = "get_product_size/";

    public static final String GET_PRODUCT_COLOUR = "get_product_color/";

    public static final String GET_PRODUCT_REVIEWS = "product_reviews/";

    public static final String ADD_TO_CART = "product_cart/";

    public static final String DELETE_FROM__CART = "product_cart_remove/";

    public static final String UPDATE_QUANTITY = "cart_quantity/";

    public static final String CART_LIST = "view_cart_items/";

    public static final String PLACE_ORDER = "place_order/";

    public static final String ORDER_DETAILS = "order_details/";

    public static final String APPLY_PROMO = "apply_promo_code/";

    public static final String SEARCH_PRODUCT = "search_product/";

    public static final String RECENT_SEARCH = "recent_search_list/";

    public static final String ADD_ADDRESS = "address_create/";

    public static final String ADDRESS_LIST = "address_list/";

    public static final String EDIT_ADDRESS = "address_update/";

    public static final String DEFAULT_ADDRESS = "address_set_default/";

    //      SignIn Params
    public static final String PARAMS_USERNAME = "username";
    public static final String PARAMS_LOGIN_TYPE = "login_type";
    public static final String PARAMS_MOBILE_TYPE = "mobile_type";
    public static final String PARAMS_GCM_KEY = "mob_key";
    public static final String PARAMS_MOBILE_NUMBER = "mobile_number";
    public static final String PARAMS_OTP = "OTP";
    public static final String PARAMS_LOGIN_PORTAL = "login_portal";
    public static final String PARAMS_EMAIL = "email";
    public static final String PARAMS_PASSWORD = "password";
//    mobile_number,OTP,mob_key,mobile_type,login_type(FB/Gplus/Mobile/Email),login_portal(Web/App)

    //      Login mode constants
    public static final int FACEBOOK = 1;
    public static final int NORMAL_SIGNUP = 2;
    public static final int GOOGLE_PLUS = 3;

    //      Login Params
    public static String PARAM_MESSAGE = "msg";

    //      Shared preferences file name
    public static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    //      Shared IMEI No
    public static final String KEY_IMEI = "imei_code";

    //      Profile Params
    public static final String PARAMS_FIRST_NAME = "first_name";
    public static final String PARAMS_LAST_NAME = "last_name";

    //      Alert Dialog Constants
    public static String ALERT_DIALOG_TITLE = "alertDialogTitle";
    public static String ALERT_DIALOG_MESSAGE = "alertDialogMessage";
    public static String ALERT_DIALOG_TAG = "alertDialogTag";
    public static String ALERT_DIALOG_POS_BUTTON = "alert_dialog_pos_button";
    public static String ALERT_DIALOG_NEG_BUTTON = "alert_dialog_neg_button";

    //      SharedPref
    public static final String KEY_LOGIN_MODE = "loginMode";

    //    USER DATA
    public static String KEY_USER_ID = "user_id";
    public static String KEY_NAME = "name";
    public static String KEY_GENDER = "gender";
    public static String KEY_EMAIL = "email";
    public static String KEY_USER_PROFILE_PIC = "profile_pic";
    public static String KEY_MOBILE_NO = "mobile_no";
    public static String KEY_VERSION = "version_code";
    public static String VERSION_VALUE = "1";
    public static String KEY_CAT_ID = "cat_id";
    public static String KEY_SUB_CAT_ID = "sub_cat_id";
    public static String KEY_SEARCH = "search_name";


    //    ADDRESS PARAMS
    public static String KEY_LAT = "lat";
    public static String KEY_LNG = "lng";
    public static String KEY_COUNTRY_ID = "country_id";
    public static String KEY_STATE = "state";
    public static String KEY_CITY = "city";
    public static String KEY_PIN_CODE = "pincode";
    public static String KEY_ADD_1 = "house_no";
    public static String KEY_ADD_2 = "street";
    public static String KEY_LANDMARK = "landmark";
    public static String KEY_FULL_NAME = "full_name";
    public static String KEY_MOB_NUM = "mobile_number";
    public static String KEY_ALT_MOB_NUM = "alternative_mobile_number";
    public static String KEY_EMAIL_ADDRESS = "email_address";
    public static String KEY_ADDRESS_TYPE = "address_type";
    public static String KEY_ADDRESS_MODE = "address_mode";
    public static String KEY_STATUS = "status";
    public static String KEY_ADDRESS_ID = "address_id";

    //    ADDRESS TYPE
    public static String TYPE_HOME = "1";
    public static String TYPE_OFFICE = "2";

    //      SharedPref
    public static final String PARAMS_PROD_ID = "product_id";
    public static final String PARAMS_ADDRESS_ID = "address_id";
    public static final String PARAMS_CART_ID = "cart_id";
    public static final String PARAMS_SIZE_ID = "size_id";
    public static final String PARAMS_COMBINED_ID = "product_comb_id";
    public static final String PARAMS_QUANTITY = "quantity";
    public static final String PARAMS_ORDER_ID = "order_id";
    public static final String PARAMS_PURCHASE_ORDER_ID = "purchse_order_id";

    public static final String KEY_SOCIAL_NETWORK_URL = "socialNetworkPicUrl";

}
