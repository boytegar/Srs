package id.project.sistemrumahsakit.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.BarcodeFormat
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.DefaultDecoderFactory

import id.project.sistemrumahsakit.R
import kotlinx.android.synthetic.main.fragment_scan.view.*
import java.util.*

class ScanFragment : Fragment() {
    var v: View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_scan, container, false)
        (activity as AppCompatActivity).setSupportActionBar(v!!.toolbar)
        (activity as AppCompatActivity).supportActionBar!!.title = "Scan Barcode"
        (activity as AppCompatActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)
        val formats = Arrays.asList(BarcodeFormat.QR_CODE, BarcodeFormat.CODABAR)
        v!!.barcode_view.barcodeView.decoderFactory = DefaultDecoderFactory(formats)
        v!!.barcode_view.initializeFromIntent(activity!!.intent)
        v!!.barcode_view.decodeContinuous(callback)
        v!!.barcode_view.setStatusText("Pastikan Posisi Barcode Pas")
        return v
    }

    override fun onResume() {
        super.onResume()
        v!!.barcode_view.resume()
    }

    override fun onPause() {
        super.onPause()
        v!!.barcode_view.pause()
    }


    private val callback = object : BarcodeCallback {
        var lastText: String? = null
        override fun barcodeResult(result: BarcodeResult) {
            lastText = result.text
            // barcode_view.setStatusText(result.text)
            if (result.text == null || result.text == lastText) {
                v!!.barcode_view.pause()
                //dialog(lastText.toString())
               Toast.makeText(activity,lastText,Toast.LENGTH_SHORT).show()
            }
        }

        override fun possibleResultPoints(resultPoints: List<ResultPoint>) {}
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}
