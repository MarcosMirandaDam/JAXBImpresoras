
package modelo;

import java.math.BigInteger;

/**
 *
 * @author Marcos Miranda
 */
public class CartuchoImpresiones {
    
    String modeloCartucho;
    int maxPaginas;

    public CartuchoImpresiones(String modeloCartucho, int maxPaginas) {
        this.modeloCartucho = modeloCartucho;
        this.maxPaginas = maxPaginas;
    }

    public String getModeloCartucho() {
        return modeloCartucho;
    }

    public void setModeloCartucho(String modeloCartucho) {
        this.modeloCartucho = modeloCartucho;
    }

    public int getMaxPaginas() {
        return maxPaginas;
    }

    public void setMaxPaginas(Integer maxPaginas) {
        this.maxPaginas = maxPaginas;
    }

    @Override
    public String toString() {
        return "CartuchoImpresiones{" + "modeloCartucho=" + modeloCartucho + ", maxPaginas=" + maxPaginas + '}';
    }
    
    
}
