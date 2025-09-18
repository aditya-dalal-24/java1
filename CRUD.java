import java.io.*;
import java.util.*;
public class CRUD {
    static String f = "students.txt";
    static List<String[]> readAll() {
        List<String[]> r = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String l;
            while ((l = br.readLine()) != null) {
                String[] p = l.split(",");
                if (p.length == 4) r.add(p); }
        } catch (IOException e) {}
        return r; }
    static void writeAll(List<String[]> r) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            for (String[] s : r) {
                bw.write(String.join(",", s));
                bw.newLine();
            }
        } catch (IOException e) {}
    }
    static void add() {
        Scanner sc = new Scanner(System.in);
        List<String[]> r = readAll();
        System.out.print("Roll: ");
        String roll = sc.nextLine();
        for (String[] s : r) if (s[0].equals(roll)) {System.out.println("Exists"); return;}
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Age: ");
        String a = sc.nextLine();
        System.out.print("Dept: ");
        String d = sc.nextLine();
        r.add(new String[]{roll, n, a, d});
        writeAll(r);
        System.out.println("Added");
    }
    static void view() {
        List<String[]> r = readAll();
        if (r.isEmpty()) {System.out.println("No records"); return;}
        System.out.println("Roll\tName\tAge\tDept");
        for (String[] s : r) System.out.println(s[0] + "\t" + s[1] + "\t" + s[2] + "\t" + s[3]);
    }
    static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll: ");
        String roll = sc.nextLine();
        List<String[]> r = readAll();
        for (String[] s : r) if (s[0].equals(roll)) {System.out.println(Arrays.toString(s)); return;}
        System.out.println("Not found");
    }
    static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll: ");
        String roll = sc.nextLine();
        List<String[]> r = readAll();
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i)[0].equals(roll)) {
                System.out.print("Name: ");
                String n = sc.nextLine();
                System.out.print("Age: ");
                String a = sc.nextLine();
                System.out.print("Dept: ");
                String d = sc.nextLine();
                r.set(i, new String[]{roll, n, a, d});
                writeAll(r);
                System.out.println("Updated");
                return; }}
        System.out.println("Not found");
    }
    static void deleteR() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll: ");
        String roll = sc.nextLine();
        List<String[]> r = readAll();
        boolean fnd = false;
        Iterator<String[]> it = r.iterator();
        while (it.hasNext()) {
            if (it.next()[0].equals(roll)) {it.remove(); fnd = true;}
        }
        if (fnd) {writeAll(r); System.out.println("Deleted");}
        else System.out.println("Not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("\n1.Add\n2.View\n3.Search\n4.Update\n5.Delete\n6.Exit");
            System.out.print("Choice: ");
            String c = sc.nextLine();
            switch (c) {
                case "1":
                    add();
                    break;
                case "2":
                    view();
                    break;
                case "3":
                    search();
                    break;
                case "4":
                    update();
                    break;
                case "5":
                    deleteR();
                    break;
                case "6":
                    break label;
                default:
                    System.out.println("Invalid");
                    break;
            }}}}