public class OOP {
    public static void main(String[] args){
        Parcare oparcare = new Parcare(1,"Parcarea de la Botanika");
        Client client1 = new Client(1,"Vasealiachi","Wasea",oparcare);
        
        System.out.println(client1.parcare.locuri);
    }
}
