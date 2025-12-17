package com.example.praktikump2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.FrameLayout

class LayoutPracticeActivity : AppCompatActivity() {

    private lateinit var spinnerExperiment: Spinner
    private lateinit var layoutLinear: LinearLayout
    private lateinit var layoutRelative: RelativeLayout
    private lateinit var layoutFrame: FrameLayout
    private lateinit var layoutViews: ConstraintLayout
    private lateinit var layoutConstraintResponsive: ConstraintLayout
    private lateinit var layoutMiniProject: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_practice)

        // Inisialisasi Views
        spinnerExperiment = findViewById(R.id.spinnerExperiment)
        layoutLinear = findViewById(R.id.layoutLinear)
        layoutRelative = findViewById(R.id.layoutRelative)
        layoutFrame = findViewById(R.id.layoutFrame)
        layoutViews = findViewById(R.id.layoutViews)
        layoutConstraintResponsive = findViewById(R.id.layoutConstraintResponsive)
        layoutMiniProject = findViewById(R.id.layoutMiniProject)

        // Setup Spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.experiment_options,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerExperiment.adapter = adapter

        spinnerExperiment.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Sembunyikan semua layout eksperimen terlebih dahulu
                hideAllExperimentLayouts()

                // Tampilkan layout yang dipilih
                when (position) {
                    1 -> layoutLinear.visibility = View.VISIBLE
                    2 -> layoutRelative.visibility = View.VISIBLE
                    3 -> layoutFrame.visibility = View.VISIBLE
                    4 -> layoutViews.visibility = View.VISIBLE
                    5 -> layoutConstraintResponsive.visibility = View.VISIBLE
                    6 -> layoutMiniProject.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }

    private fun hideAllExperimentLayouts() {
        layoutLinear.visibility = View.GONE
        layoutRelative.visibility = View.GONE
        layoutFrame.visibility = View.GONE
        layoutViews.visibility = View.GONE
        layoutConstraintResponsive.visibility = View.GONE
        layoutMiniProject.visibility = View.GONE
    }
}