/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subtraction;

/**
 *
 * @author Екатерина
 */
public class op_subtraction {
    private int value;
    
    
    
    public op_subtraction(int v){
          value = v;
          
    }
    
    public op_subtraction sub(op_subtraction v1){
        return new op_subtraction (value-v1.getValue());
    }
    public int getValue(){
        return value;
    }
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        op_subtraction other = (op_subtraction) obj;
        if (value != other.value)
            return false;
        
        return true;
    }
}
