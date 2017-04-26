package io.spring.batch.domain;

import java.time.LocalDateTime;

/**
 * Created by camilo.hernandez on 3/04/17.
 */
public class Course {

	private long courseId;
	private String code;
	private String typeCode;
	private String subTypeCode;
	private String siteCode;
	private long revisionDate;
	private String title;
	private String description;
	private double contactHours;
	private String lastModifiedBy;
	private LocalDateTime lastModifiedOn;
	private String createdBy;

	public Course(long courseId, String code, String typeCode,
			String subTypeCode, String siteCode, long revisionDate,
			String title, String description, double contactHours,
			String lastModifiedBy, LocalDateTime lastModifiedOn,
			String createdBy) {

		this.courseId = courseId;
		this.code = code;
		this.typeCode = typeCode;
		this.subTypeCode = subTypeCode;
		this.siteCode = siteCode;
		this.revisionDate = revisionDate;
		this.title = title;
		this.description = description;
		this.contactHours = contactHours;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedOn = lastModifiedOn;
		this.createdBy = createdBy;
	}

	public long getCourseId() {

		return courseId;
	}

	public String getCode() {

		return code;
	}

	public String getTypeCode() {

		return typeCode;
	}

	public String getSubTypeCode() {

		return subTypeCode;
	}

	public String getSiteCode() {

		return siteCode;
	}

	public long getRevisionDate() {

		return revisionDate;
	}

	public String getTitle() {

		return title;
	}

	public String getDescription() {

		return description;
	}

	public double getContactHours() {

		return contactHours;
	}

	public String getLastModifiedBy() {

		return lastModifiedBy;
	}

	public LocalDateTime getLastModifiedOn() {

		return lastModifiedOn;
	}

	public String getCreatedBy() {

		return createdBy;
	}
}
