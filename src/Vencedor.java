public class Vencedor {
	public Vencedor() {
	}

	public int Vencer(int a, int b){ 
     if(a==1 && b==1){
         return 2;
     }
     if(a==0 && b==0){
     return 2;
     }
     if(a==2 && b==2){
         return 2;
     }

     if(a==2 && b==0){ 
         return 1; 
     }
     if(a==1 && b==2){
         return 1; 
     }
     if(a==0 &&b==1){ 
         return 1;
     }

     if(a==0 && b==2){
         return 0; 
     }
     if(a==2 && b==1){
         return 0;
     }
     if(a==1 && b==0){
         return 0;
     }
     return 3;
    }
}