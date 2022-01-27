import java.util.Stack;

public class Number_of_valid_subarray_nse {
    public static void main(String[] args) {
        int[] ht = {1,4,2,5,3};
        Stack<Integer> st = new Stack<>();
        int[] smallest = new int[ht.length];
        smallest[ht.length-1]=-1;
        for (int curr = 0; curr < ht.length; curr++) {
            while(!st.isEmpty() && ht[curr]<ht[st.peek()]){
                smallest[st.peek()]=curr;
                st.pop();
            }
            st.push(curr);
        }
        int count =0;
        while(!st.isEmpty()){
            smallest[st.pop()]=  ht.length;
        }
        for (int i = 0; i < smallest.length ;i++) {
            count+=smallest[i]-i;
        }
        System.out.println(count);
    }
}
