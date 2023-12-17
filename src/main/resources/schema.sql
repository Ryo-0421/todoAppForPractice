CREATE TABLE IF NOT EXISTS todo_details (
title VARCHAR(40) UNIQUE,
is_done BOOLEAN,
time_limit DATE
);