package percabangan;
public class Percabangan {
    public static void main(String[] args) {
        int x=3;
        //buat switch case
        switch (x){
                
            case 1:
                System.out.println("nilai x = 1");
                break;
                
            case 2:
                System.out.println("nilai x = 2");
                break;
                
            default:
                System.out.println("nilai a tidak di katahui");
    }
}
    private void bt_hasilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        switch(pilih){
            case 1:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1+bil2;
            bilangan = Double.toString(jumlah);            
            break;
        case 2:
            bil2 =Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 - bil2;
            bilangan = Double.toString(jumlah);            
            break;
        
        //perlu menambah 1 case lagi
        case 4:
            bil2 = Double.parseDouble(String.valueOf(txt_hasil.getText()));
            jumlah = bil1 / bil2;
            bilangan = Double.toString(jumlah);            
            break;  
        }
        txt_hasil.setText(bilangan);
    }
}
/* @param  x the first {@code int} to compare
 * @param  y the second {@code int} to compare
 * @return the value {@code 0} if {@code x == y};
