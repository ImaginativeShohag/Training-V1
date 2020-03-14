package org.imaginativeworld.dayone

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form.*
import org.imaginativeworld.dayone.databinding.ActivityFormBinding
import org.imaginativeworld.dayone.databinding.CustomListItemBinding

class FormActivity : AppCompatActivity() {

    val TAG = "FormActivity"

    private lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Init Spinner
        val lists = listOf<String>(
            "-- select --",
            "Male",
            "Female",
            "Others"
        )
        val arrayAdapter = ArrayAdapter<String>(
            this,
            R.layout.custom_list_item,
            lists
        )
        binding.gender.adapter = arrayAdapter

        binding.name.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

                s?.let { theText ->

                    if (theText.toString().toLowerCase().startsWith("mr")) {
                        gender.setSelection(1)
                    } else if (theText.toString().toLowerCase().startsWith("miss")) {
                        gender.setSelection(2)
                    }

                }

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


            }

        })

        binding.btnSubmit.setOnClickListener {

            if (validate()) {

                Toast.makeText(this, "Submitted", Toast.LENGTH_LONG).show()

                Log.d(TAG, "Name: ${binding.name.text}")
                Log.d(TAG, "email: ${binding.email.text}")
                Log.d(TAG, "password: ${binding.password.text}")
                Log.d(TAG, "gender: ${binding.gender.selectedItem}")

                val checkRadioBtn: RadioButton = findViewById(binding.options.checkedRadioButtonId)

                Log.d(TAG, "options: ${checkRadioBtn.text}")


            }

        }

        binding.datePicker.setOnClickListener {

            val datePicker = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { datePicker: DatePicker, i: Int, i1: Int, i2: Int ->


                },
                2020,
                1,
                1
            )
            datePicker.show()

        }
    }

    private fun validate(): Boolean {

        binding.nameLayout.error = null
        binding.emailLayout.error = null
        binding.passwordLayout.error = null

        binding.name.apply {
            if (text!!.isEmpty()) {
                binding.nameLayout.error = "Enter name!!!"
                findFocus()
                return false
            }
        }

//        if (binding.name.text!!.isEmpty()) {
//            binding.nameLayout.error = "Enter name!!!"
//            binding.name.findFocus()
//            return false
//        }

        if (binding.email.text!!.isEmpty()) {
            binding.emailLayout.error = "Enter email!!!"
            binding.email.findFocus()
            return false
        }

        if (binding.email.text != null &&
            !binding.email.text!!.contains("@") &&
            !binding.email.text!!.contains(".")
        ) {
            binding.emailLayout.error = "Enter email!!!"
            binding.email.findFocus()
            return false
        }

        if (binding.password.text!!.isEmpty()) {
            binding.passwordLayout.error = "Enter password!!!"
            binding.password.findFocus()
            return false
        }

        if (binding.gender.selectedItemPosition == 0) {

            Toast.makeText(this, "Select Gender", Toast.LENGTH_SHORT).show()

            return false
        }

        return true
    }
}
