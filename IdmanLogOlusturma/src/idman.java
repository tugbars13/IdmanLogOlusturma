
public class idman {
    
    private int burpeeSayisi;
    private int pushubSayisi;
    private int situpSayisi;
    private int squatSayisi;
   
    
    public idman(int burpeeSayisi,int pushubSayisi,int situpSayısı,int squatSayisi){
        this.burpeeSayisi=burpeeSayisi;
        this.pushubSayisi=pushubSayisi;
        this.situpSayisi=situpSayisi;
        this.squatSayisi=squatSayisi;
    }
    public void hareketYap(String hareketTuru,int sayi){
        if(hareketTuru.equals("burpee")){
            burpeeYap(sayi);
        }else if(hareketTuru.equals("pushub")){
            pushubYap(sayi);
        }else if(hareketTuru.equals("situp")){
            situpYap(sayi);
            
        }else if(hareketTuru.equals("squat")){
            squatYap(sayi);
        }else{
            System.out.println("gecersiz hareket girdiniz...");
        }
    }
    public void burpeeYap(int sayi){
        if(burpeeSayisi == 0){
            System.out.println("yapacak burpee kalmadı...");
        }if(burpeeSayisi-sayi<0){
            System.out.println("hedefledigin burpee sayisini gectin tebrikler!");
            burpeeSayisi=0;
            System.out.println("kalan burpee : "+burpeeSayisi);
        }else{
            burpeeSayisi-=sayi;
            System.out.println("kalan burpee : "+burpeeSayisi);
        }
    }
    public void pushubYap(int sayi){
        if(pushubSayisi==0){
            System.out.println("yapavak pushub kalmadı...");
        }if(pushubSayisi-sayi<0){
            System.out.println("hedeflediginiz pushub sayisini gectiniz tebrikler!");
            pushubSayisi=0;
            System.out.println("kalan pushub : "+pushubSayisi);
        }else{
            pushubSayisi-=sayi;
            System.out.println("kalan pushub : "+pushubSayisi);
        }
    }
    public void situpYap(int sayi){
        if(situpSayisi==0){
            System.out.println("yapacak situp kalmadı...");
            
        }if(situpSayisi-sayi<0){
            System.out.println("hedeflediginiz situp sayisini gctiniz tebrikler!");
            situpSayisi=0;
            System.out.println("kalan situp : "+situpSayisi);
            
        }else{
            situpSayisi-=sayi;
            System.out.println("kalan situp : "+situpSayisi);
        }
    }
    public void squatYap(int sayi){
        if(squatSayisi==0){
            System.out.println("yapacak squat kalmadı...");
            
        }if(squatSayisi-sayi<0){
            System.out.println("hedeflediginiz squat sayisini gectşniz tebrikler!");
            squatSayisi=0;
            System.out.println("kalan squat : "+squatSayisi);
            
        }else{
            squatSayisi-=sayi;
            System.out.println("kalan squat : "+squatSayisi);
        }
    }
    public boolean idmanBittiMi(){
        return((burpeeSayisi==0)&&(pushubSayisi==0)&&(situpSayisi==0)&&(squatSayisi==0));
    }

    /**
     * @return the burpeeSayisi
     */
    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    /**
     * @param burpeeSayisi the burpeeSayisi to set
     */
    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    /**
     * @return the pushubSayisi
     */
    public int getPushubSayisi() {
        return pushubSayisi;
    }

    /**
     * @param pushubSayisi the pushubSayisi to set
     */
    public void setPushubSayisi(int pushubSayisi) {
        this.pushubSayisi = pushubSayisi;
    }

    /**
     * @return the situpSayısı
     */
    public int getSitupSayisi() {
        return situpSayisi;
    }

    /**
     * @param situpSayısı the situpSayısı to set
     */
    public void setSitupSayisi(int situpSayısı) {
        this.situpSayisi = situpSayısı;
    }

    /**
     * @return the squatSayisi
     */
    public int getSquatSayisi() {
        return squatSayisi;
    }

    /**
     * @param squatSayisi the squatSayisi to set
     */
    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    
}
