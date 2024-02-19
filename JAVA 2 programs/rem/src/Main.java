public class Main {
    public static void main(String[] args) {
        String l = "Riishabhhhhsf";
        char[] arr = l.toCharArray();
        int n = arr.length;
        for (int i=0; i< n; i++){
            for(int j=i+1; j<n;){
                if(arr[i] == arr[j]){
                   for(int k=j; k< n-1; k++){
                       arr[k] = arr[k+1];
                   }
                   n--;
                }else{
                    j++;
                }
            }

        }
        char[] arr1 = new char[n];
        for (int x=0; x<n; x++){
            arr1[x] = arr[x];
        }
        String newletter = new String(arr1);
        System.out.println(newletter);
    }
}