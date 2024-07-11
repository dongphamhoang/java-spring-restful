package vn.hoidanit.jobhunter.domain.response.job;

import java.time.Instant;
import java.util.List;

import vn.hoidanit.jobhunter.util.constant.LevelEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResUpdateJobDto {
    private long id;
    private String name;
    private String location;
    private double salary;
    private int quantity;
    private LevelEnum level;
    private Instant startDate;
    private Instant endDate;
    private boolean isActive;
    private List<String> skills;
    private Instant createAt;
    private String createBy;
}
