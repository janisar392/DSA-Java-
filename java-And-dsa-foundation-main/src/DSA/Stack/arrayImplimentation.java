package DSA.Stack;




public class arrayImplimentation {

    public static class Stack{
        private int[] arr = new int[3];
        private int idx=0;

        void push(int a){

            if(isFull()){
                System.out.println("Stack is overflow");
                return;
            }
            arr[idx] =a;
            idx++;
        }
        int pop(){

            if(idx<=0)
                return -1;

            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int peak(){
            if(idx<=0){
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0 ; i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx<=0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;

            return false;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(23);
        st.push(16);
        st.push(15);

        st.display();

        st.pop();
        st.display();

        System.out.println("Peak: "+ st.peak());

        st.push(23);
        st.push(98);
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.size());

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
    }
}
