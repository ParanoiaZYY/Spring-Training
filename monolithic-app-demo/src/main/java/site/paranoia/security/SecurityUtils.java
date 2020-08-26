package site.paranoia.security;

/**
 * Utility class for Spring Security.
 */
public final class SecurityUtils {

    private SecurityUtils() {
    }

    /***
     * 通过token获得当前的userId
     * @return
     */
    public static Integer getCurrentUserId() {
        Integer userId = 1;
        return userId;
    }

    /**
     * 获取当前登录公司companyId
     *
     */
    public static Integer getCurrentCompanyId(){
        Integer companyId = 1;
        return companyId;
    }
}
