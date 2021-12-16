package com.crud.ffin.service.domain;
import java.util.Date;
import lombok.Data;

@Data
public class Purchase {
    //user TABLE
    private String userId;  //user_id
    private String userPassword; //nickname
    private String userName; //user_name
    private String userPhone;  //phone
    private Date userBirth;
    private String userAddr;
    private String userAddrDetail;
    private double userMapLa;
    private double userMapLo;
    private String reportCount;
    private String userEmail;
    private int userEmailStatus;
    private String userProImg;
    private int userFavPlace;
    private String userFavMenu;
    private String userIntro;
    private int userTotalPoint;
    private int userByeStatus;
    private int userByeReason;
    private Date blackRegDate;
    private Date blackRestPer;

    public void Purchase(){}

    public String getUserProImg() {
        return userProImg;
    }
    public void setBlackRestPer(Date blackRestPer) {
        this.blackRestPer = blackRestPer;
    }
}
