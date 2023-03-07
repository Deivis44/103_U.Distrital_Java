package cap_4;
public class calculo {
  private String binario;
   private int key;
   
        public void Binario(String binario,int key) {
            this.binario = binario;
            this.key=key;
        }

        public String getbinario(String binario) {
            return binario ;
            }
            
        public void setBinario(String binario) {
            this.binario = binario;
        } 

        public int getkey() {
            return key;
            }
        
            public void setkey(int key) {
            this.key = key;
            }

        public int convertir() {
            int decimal = 0;
            int potencia = 1;
    
            for (int i = binario.length() - 1; i >= 0; i--) {
                int bit = Character.getNumericValue(binario.charAt(i));
                    decimal += bit * potencia;
                    potencia *= 2;
            }
            return decimal;
        }
    }