package com.jack.demo01_rent.host;

import com.jack.demo01_rent.abs.Rent;

/**
 * @ClassName Host
 * @Description Jack
 * @Author jack.bao
 * @Date 3/29/2022 4:18 PM
 * @Version 1.0
 **/

//真实角色: 房东，房东要出租房子
public class Host implements Rent {
    public void rent() {
        System.out.println("房屋出租");
    }
}
