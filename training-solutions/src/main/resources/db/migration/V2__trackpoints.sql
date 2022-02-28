CREATE TABLE track_point (id BIGINT, tp_time DATE, lat DOUBLE(9, 7), lon DOUBLE(10, 7),
CONSTRAINT FK_activities FOREIGN KEY (id) REFERENCES activities(id));