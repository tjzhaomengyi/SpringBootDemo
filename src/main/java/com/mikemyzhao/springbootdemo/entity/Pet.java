package com.mikemyzhao.springbootdemo.entity;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/2 16:20
 * @Description:
 */
public class Pet {
    private String nickName;
    private String strain;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                ", strain='" + strain + '\'' +
                '}';
    }
}
