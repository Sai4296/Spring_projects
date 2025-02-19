package com.codesnippet.SpringBatchDemo.controller;



import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.SpringBatchDemo.entity.Person;
import com.codesnippet.SpringBatchDemo.repository.PersonRepository;

@RestController
@RequestMapping("/jobs")
public class JobController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;

	@PostMapping("/importData")
	public String jobLauncher() {

		final JobParameters jobParameters = new JobParametersBuilder()
				.addLong("startAt", System.currentTimeMillis()).toJobParameters();

			try {
				// Launch the job
				final JobExecution jobExecution = jobLauncher.run(job, jobParameters);

				// Return job status
				return jobExecution.getStatus().toString();
			} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
					| JobParametersInvalidException e) {
				e.printStackTrace();
				return "Job failed with exception: " + e.getMessage();
			}
		}
	@GetMapping("/importedData")
    public List<Person> getImportedData() {
        return personRepository.findTop10ByOrderByIdAsc();  // Fetch all records from DB
    }
	}



