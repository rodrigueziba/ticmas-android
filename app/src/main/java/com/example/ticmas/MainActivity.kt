package com.example.ticmas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.ticmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()

            val textoModel = TextoModel(text1, text2)

            viewModel.compareTextos(textoModel)
        }

        viewModel.result.observe(this) { result ->
            binding.resultTextView.text = result
        }
    }
}
