
public class Main {
    public static void main(String[] args) {
        Audio audio = new Audio(123, "nombre", ".mp3", "arturo", "2025", "2025", 123);
        Imagen imagen = new Imagen(123, "nombre", ".mp3", "arturo", "2025", "2025", "123");
        Video video = new Video(123, "nombre", ".mp3", "arturo", "2025", "2025", new String[8]);
        ArchivoMultimedia archivo = new ArchivoMultimedia(123, "nombre", ".mp3", "arturo", "2025", "2025");

        System.out.println(audio.toString());
        System.out.println(imagen.toString());
        System.out.println(video.toString());
        System.out.println(archivo.toString());

        int i;
        int j;
        int k;
        determinacion:
        for (i = 0; i < 10; i++) {
            persistence:
            for (j = 0; j < 10; j++) {
                if(i == 8) {
                    break determinacion;
                }
                for (k = 0; k < 10; k++) {
                    if(i % 2 == 0)
                        continue determinacion;
                    if(k == 5)
                        break persistence;
                    System.out.println(i +""+ j+"" + k);
                }
            }
            System.out.println("Hello world!");

            switch(8) {
                case 1:
                    System.out.println("En case 1");
                    break;
                    case 2:
                    System.out.println("En case 2");
                    break;
                    case 3:
                    System.out.println("En case 3");
                    break;
                case 8:
                    System.out.println("En case 8");
                    break;

            }

        }


    }
}