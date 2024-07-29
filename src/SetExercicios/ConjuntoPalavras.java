package SetExercicios;

import java.util.Objects;

public class ConjuntoPalavras {
     private String animais;

    public ConjuntoPalavras(String animais) {
        this.animais = animais;
    }

    public String getAnimais() {
        return animais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavras that)) return false;
        return Objects.equals(getAnimais(), that.getAnimais());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAnimais());
    }

    @Override
    public String toString() {
        return "ConjuntoPalavras{" +
                "animais='" + animais + '\'' +
                '}';
    }
}
