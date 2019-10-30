import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Page/Penjualan/Produk/Open product page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Add_Produk/button_Tambah Produk'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Produk/select_ObatUmumAlkes'))

WebUI.selectOptionByValue(findTestObject('Page_Produk/select_ObatUmumAlkes'), 'drugs', true)

WebUI.setText(findTestObject('Add_Produk/input_Barcode_item_barcode'), '12312412312')

WebUI.setText(findTestObject('Add_Produk/input_Nama Produk_item_nama'), 'nama item')

WebUI.setText(findTestObject('Add_Produk/input_Rp_item_price_buy'), '5000')

WebUI.click(findTestObject('Add_Produk/label_PPN Beli 10'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add_Produk/input_Margin_item_margin_non_resep'), '100')

WebUI.setText(findTestObject('Add_Produk/input_Margin Resep_item_margin_resep'), '150')

WebUI.selectOptionByValue(findTestObject('Add_Produk/combo_kemasan_dasar'), '64', true)

WebUI.setText(findTestObject('Add_Produk/input_Jumlah DosisVol_item_kekuatan'), '500')

WebUI.selectOptionByValue(findTestObject('null'), '41', true)

WebUI.click(findTestObject('Add_Produk/btn_Simpan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Produk/input_Jumlah DosisVol_item_kekuatan'), '500')

WebUI.verifyElementVisible(findTestObject('Page_Produk/div_Berhasil simpan data produk'))

WebUI.click(findTestObject('Page_Produk/button_OK'))

