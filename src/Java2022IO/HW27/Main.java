package Java2022IO.HW27;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager baseKrediManager : krediManagers) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
        
        //OgretmenKrediManager oKrediManager = new OgretmenKrediManager();
        //System.out.println(oKrediManager.hesapla(1000));
    }
}