CREATE TABLE activities(id BIGINT AUTO_INCREMENT, start_time DATESTAMP,
    description VARCHAR(255), activity_type VARCHAR(20),
    CONSTRAINT pk_activities PRIMARY KEY(id));