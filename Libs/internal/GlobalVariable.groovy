package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object product_barcode
     
    /**
     * <p></p>
     */
    public static Object product_name
     
    /**
     * <p></p>
     */
    public static Object product_harga_beli
     
    /**
     * <p></p>
     */
    public static Object product_margin
     
    /**
     * <p></p>
     */
    public static Object product_margin_resep
     
    /**
     * <p></p>
     */
    public static Object product_harga_jual
     
    /**
     * <p></p>
     */
    public static Object product_harga_jual_resep
     
    /**
     * <p></p>
     */
    public static Object product_kemasan_dasar
     
    /**
     * <p></p>
     */
    public static Object product_stok_minimal
     
    /**
     * <p></p>
     */
    public static Object product_stok_awal
     
    /**
     * <p></p>
     */
    public static Object product_tgl_kadaluarsa
     
    /**
     * <p></p>
     */
    public static Object product_no_batch
     
    /**
     * <p></p>
     */
    public static Object product_dosis
     
    /**
     * <p></p>
     */
    public static Object product_satuan
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            product_barcode = selectedVariables['product_barcode']
            product_name = selectedVariables['product_name']
            product_harga_beli = selectedVariables['product_harga_beli']
            product_margin = selectedVariables['product_margin']
            product_margin_resep = selectedVariables['product_margin_resep']
            product_harga_jual = selectedVariables['product_harga_jual']
            product_harga_jual_resep = selectedVariables['product_harga_jual_resep']
            product_kemasan_dasar = selectedVariables['product_kemasan_dasar']
            product_stok_minimal = selectedVariables['product_stok_minimal']
            product_stok_awal = selectedVariables['product_stok_awal']
            product_tgl_kadaluarsa = selectedVariables['product_tgl_kadaluarsa']
            product_no_batch = selectedVariables['product_no_batch']
            product_dosis = selectedVariables['product_dosis']
            product_satuan = selectedVariables['product_satuan']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
