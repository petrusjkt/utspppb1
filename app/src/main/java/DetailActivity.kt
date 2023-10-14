import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movieTitle = intent.getStringExtra("movieTitle") ?: ""
        val movieDescription = "Deskripsi film $movieTitle" // Gantilah dengan deskripsi sesuai film yang dipilih.
        val movieRating = "Rating film $movieTitle" // Gantilah dengan rating sesuai film yang dipilih.

        movieTitleText.text = movieTitle
        movieDescriptionText.text = movieDescription
        movieRatingText.text = movieRating

        beliTiketButton.setOnClickListener {
            // Pindah ke activity pemesanan tiket (sebagai contoh)
            val intent = Intent(this, PemesananTiketActivity::class.java)
            startActivity(intent)
        }
    }
}
