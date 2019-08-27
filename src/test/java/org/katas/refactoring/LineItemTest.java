/*
 * Copyright (C), 1992-2019
 * Package org.katas.refactoring 
 * FileName: LineItemTest.java
 * Author:   wang-hc
 * Date:     2019年8月27日 下午9:07:15
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月27日下午9:07:15                     1.0                  
 *===============================================================================================
 */
package org.katas.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月27日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class LineItemTest {
    
    @Test
    public void should_return_6_when_totalAmount_given_price_2_quantity_3() {
        //given
        LineItem lineItem = new LineItem("", 2, 3);
        
        //when
        double result = lineItem.totalAmount();
        
        //then
        assertEquals(6.0, result);
    }

}
