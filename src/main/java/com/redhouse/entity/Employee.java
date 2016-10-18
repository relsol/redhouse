package com.redhouse.entity;

import java.util.Date;

/**
 * 用户表
 */
public class Employee {

    private Integer id;
    /**
     * 登录帐号
     **/
    private String loginName;
    /**
     * 登录密码
     **/
    private String password;
    /**
     * 姓名
     **/
    private String userName;
    /**
     * 性别，1-男，0-女
     **/
    private Integer sex;
    /**
     * 职员编号
     **/
    private String jobNum;
    /**
     * 电话
     **/
    private String phone;
    /**
     * 手机
     **/
    private String mobile;
    /**
     * 住址
     **/
    private String address;
    /**
     * 注销 0：未注销，1：已注销
     **/
    private Integer cancel;
    /**
     * IP地址
     **/
    private String ipAddress;
    /**
     * 激光推送ID
     **/
    private String jpushId;
    /**
     * 用户标记1：普通用户 2：区领导 3：城管局领导 4：局考核组 5:社会义务监督员
     **/
    private Integer flag;
    /**
     * 创建人
     **/
    private String create;
    /**
     * 创建人ID
     **/
    private Integer createrId;
    /**
     * 创建时间
     **/
    private Date createrTime;
    /**
     * 修改人
     **/
    private String update;
    /**
     * 修改人ID
     **/
    private Integer updaterId;
    /**
     * 最后修改时间
     **/
    private Date updaterTime;


    /**
     * 无参的构造函数
     **/
    public Employee() {
        super();
    }

    /**
     * 有参构造函数
     **/
    public Employee(String loginName, String password, String userName, Integer sex, String jobNum, String phone, String mobile, String address, Integer cancel,
                    String ipAddress, String jpushId, Integer flag, String create, Integer createrId, Date createrTime, String update, Integer updaterId, Date updaterTime) {
        super();
        this.loginName = loginName;
        this.password = password;
        this.userName = userName;
        this.sex = sex;
        this.jobNum = jobNum;
        this.phone = phone;
        this.mobile = mobile;
        this.address = address;
        this.cancel = cancel;
        this.ipAddress = ipAddress;
        this.jpushId = jpushId;
        this.setFlag(flag);
        this.create = create;
        this.createrId = createrId;
        this.createrTime = createrTime;
        this.update = update;
        this.updaterId = updaterId;
        this.updaterTime = updaterTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**

     * @return 登录帐号
     */

    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName 登录帐号
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return 登录密码
     */

    public String getPassword() {
        return password;
    }

    /**
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return 姓名
     */

    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return 性别，1-男，0-女
     */

    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex 性别，1-男，0-女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return 职员编号
     */

    public String getJobNum() {
        return jobNum;
    }

    /**
     * @param jobNum 职员编号
     */
    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    /**
     * @return 电话
     */

    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 手机
     */

    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return 住址
     */

    public String getAddress() {
        return address;
    }

    /**
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return 注销 0：未注销，1：已注销
     */

    public Integer getCancel() {
        return cancel;
    }

    /**
     * @param cancel 注销 0：未注销，1：已注销
     */
    public void setCancel(Integer cancel) {
        this.cancel = cancel;
    }

    /**
     * @return IP地址
     */

    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return 激光推送ID
     */

    public String getJpushId() {
        return jpushId;
    }

    /**
     * @param jpushId 激光推送ID
     */
    public void setJpushId(String jpushId) {
        this.jpushId = jpushId;
    }

    /**
     * @return 创建人
     */

    public String getCreate() {
        return create;
    }

    /**
     * @param create 创建人
     */
    public void setCreate(String create) {
        this.create = create;
    }

    /**
     * @return 创建人ID
     */

    public Integer getCreaterId() {
        return createrId;
    }

    /**
     * @param createrId 创建人ID
     */
    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    /**
     * @return 创建时间
     */

    public Date getCreaterTime() {
        return createrTime;
    }

    /**
     * @param createrTime 创建时间
     */
    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    /**
     * @return 修改人
     */

    public String getUpdate() {
        return update;
    }

    /**
     * @param update 修改人
     */
    public void setUpdate(String update) {
        this.update = update;
    }

    /**
     * @return 修改人ID
     */

    public Integer getUpdaterId() {
        return updaterId;
    }

    /**
     * @param updaterId 修改人ID
     */
    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
    }

    /**
     * @return 最后修改时间
     */

    public Date getUpdaterTime() {
        return updaterTime;
    }

    /**
     * @param updaterTime 最后修改时间
     */
    public void setUpdaterTime(Date updaterTime) {
        this.updaterTime = updaterTime;
    }

    /**
     * @return 用户标记（1：普通用户 2：区领导 3：城管局领导 4：局考核组 5:社会义务监督员）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag 用户标记（1：普通用户 2：区领导 3：城管局领导 4：局考核组 5:社会义务监督员）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
