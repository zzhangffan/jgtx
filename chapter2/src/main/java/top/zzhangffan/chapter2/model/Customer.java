/**
 * Copyright (C), XXXX-2018, XXX有限公司
 * FileName: Customer
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.zzhangffan.chapter2.model;

/**
 * 〈一句话功能简述〉<br> 
 * 〈客户〉
 *  <p></p>
 *
 * @author zzhan
 * @create 2018/2/23
 * @since 1.0.0
 */
public class Customer {

    /**
     * ID
     */
    private long id;
    /**
     * 客户姓名
     */
    private String name;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 联系方式
     */
    private String telephone;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 备注
     */
    private String remark;










    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}