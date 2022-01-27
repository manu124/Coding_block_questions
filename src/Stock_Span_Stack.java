
import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_Stack {
    public static void main(String[] args) {
        int[] ht={100,80,60,70,60,75,85};
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] span = new int[ht.length];
        span[0]=1;
        for (int cur = 1; cur <ht.length; cur++) {
            while(!st.isEmpty() && ht[cur]>=ht[st.peek()]){
                st.pop();
            }
            span[cur]=cur-st.peek();
            st.push(cur);
        }
        System.out.println(Arrays.toString(span));

    }
}
