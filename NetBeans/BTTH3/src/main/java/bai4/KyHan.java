/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author LE TUNG
 */
public enum KyHan {
    MOT_TUAN{
        @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.DAY_OF_YEAR, 7);
            return current;
        }

        @Override
        public BigDecimal tinhLai(BigDecimal st) {
            Calendar c = new GregorianCalendar();
            int d = c.getActualMaximum(Calendar.DAY_OF_YEAR);
            return st.multiply(new BigDecimal(7 * 0.0005))
                    .divide(new BigDecimal(d), RoundingMode.HALF_UP);   
        }
        
        
    },
    MOT_THANG {
         @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.MONTH, 1);
            return current;
        }

        @Override
        public BigDecimal tinhLai(BigDecimal st) {
            // 12 -> 0.045 * st
            // 1 -> ?            
            return st.multiply(new BigDecimal(0.045)).divide(new BigDecimal(12));
        }
    },
    MOT_NAM{
        @Override
        public Calendar tinhDaoHan(Calendar current) {
            current.add(Calendar.YEAR, 1);
            return current;
        }

        @Override
        public BigDecimal tinhLai(BigDecimal st) {
            return st.multiply(new BigDecimal(0.068));
        }
    
    };
    
    
    public abstract Calendar tinhDaoHan(Calendar current);
    public abstract BigDecimal tinhLai(BigDecimal st);
}

