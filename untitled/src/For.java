public class For {
    public static void main(String[] args) {

// Üçgenimizin kaç satırdan oluşacağını ve satır seçimlerini belirliyoruz.
        for (int i = 0; i < 5; i++)

            for (int j = 0; j <= 5 - i; j++)
                // Üçgenimizin sütunlarına gerekli değerde boşluk atanmasını sağlıyoruz.

                System.out.print(" ");

            for (int k = 0; k <= i * 2; k++) // Üçgenimizin oluşmasını sağlayacak sütunlara yıldız ataması gerçekleştiriyoruz.

                System.out.print("*");

            if (i != 4)

                System.out.print(" \t-> " + (i + 1) + ". üçgen satırı\n");

            else

                System.out.print("\t-> " + (i + 1) + ". üçgen satırı\n");
        }
    }

        }






