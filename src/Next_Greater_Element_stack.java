import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_stack {
    public static void main(String[] args) {
        int[] ht = {5,3,6,4,3,2,5,8};
        Stack<Integer> st = new Stack<>();
        int[] greater = new int[ht.length];
        greater[ht.length-1]=-1;
        for (int curr = 0; curr < ht.length; curr++) {
            while(!st.isEmpty() && ht[curr]>ht[st.peek()]){
                greater[st.peek()]=ht[curr];
                st.pop();
            }
            st.push(curr);
        }
        while(!st.isEmpty()){
            greater[st.pop()]=-1;
        }
        for (int i = 0; i < greater.length ;i++) {
            System.out.println("nge of "+ ht[i]+" = "+greater[i]);
        }
    }
}
