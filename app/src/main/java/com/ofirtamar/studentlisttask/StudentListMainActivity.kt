package com.ofirtamar.studentlisttask

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ofirtamar.studentlisttask.databinding.ActivityStudentsRecyclerViewBinding
import com.ofirtamar.studentlisttask.models.Student

class StudentListMainActivity : BaseActivity() {

    private lateinit var binding: ActivityStudentsRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Students List"
        binding = ActivityStudentsRecyclerViewBinding.inflate(layoutInflater)

        super.contentFrame.addView(binding.root)

        binding.studentRecyclerView.layoutManager = LinearLayoutManager(this)

        val students = mutableListOf<Student>()

        val imageUri = "android.resource://com.ofirtamar.studentlisttask/" + R.mipmap.ic_launcher

        students.add(Student("1", "John Doe", "555-1234", "123 Main St", false, imageUri))
        students.add(Student("2", "Jane Smith", "555-5678", "456 Oak Ave", true, imageUri))
        students.add(Student("3", "Peter Jones", "555-9012", "789 Pine Ln", false, imageUri))

        val adapter = StudentListAdapter(students)
        binding.studentRecyclerView.adapter = adapter
    }
}