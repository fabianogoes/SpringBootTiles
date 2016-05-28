package com.eprogramar.springboot.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(locations = "classpath:system.properties", prefix = "app")
public class ApplicationProperties {

	public static class Version {
		private String number;
		private String date;
		private String description;

		public Version() {
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Version [number=" + number + ", date=" + date + ", description=" + description + "]";
		}
	}

	private String name;
	private String title;
	private Version version;
	private String at;
	private String company;

	public ApplicationProperties() {
	}

	public ApplicationProperties(String name, String title, Version version, String at, String company) {
		this.name = name;
		this.title = title;
		this.version = version;
		this.at = at;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "ApplicationProperties [name=" + name + ", title=" + title + ", version=" + version + ", at=" + at
				+ ", company=" + company + "]";
	}

}
