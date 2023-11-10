import java.util.Stack;

public class aapp {
    public static void main(String[] args) {
        Stack<String> jurusan = new Stack<String>();
        jurusan.push("Teknik Informatika");
        jurusan.push("Sistem Informasi");
        jurusan.push("Teknik Industri");
        jurusan.push("Teknik Sipil");
        //jurusan.pop();
        //jurusan.pop();
        //jurusan.pop();
        //jurusan.pop();

        System.out.println("check apakah kosong ? \t\t : " + jurusan.empty());System.out.println("check apakah kosong(isEmpty) ? \t\t : " + jurusan.isEmpty());

        //System.out.println("peek" + jurusan.peek());

        System.out.println("lihat index ke 2 \t\t" + jurusan.get(2));
        System.out.println("Stack pertama \t\t : " + jurusan.firstElement());
        System.out.println("Stack yang terakhir \t\t : " + jurusan.lastElement());

        System.out.println("Stack yang terakhir \t\t : " + jurusan.lastElement());
        //jurusan.remove(3);
        //jurusan.remove(0);
        //jurusan.remove(0);
        //jurusan.remove(0);

        System.out.println("Stack Item \t\t : " + jurusan);
        jurusan.clear();
        System.out.println("Stack Item \t\t : " + jurusan);
    }
    
}