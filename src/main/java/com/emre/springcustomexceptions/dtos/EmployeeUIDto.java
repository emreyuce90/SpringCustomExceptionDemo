package com.emre.springcustomexceptions.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUIDto {

    @NotNull(message = "Employee name alanı boş geçilemez")
    @Min(value = 2,message = "Employee name alanı en az 2 karakter olmalıdır")
    @Max(value = 30,message = "Employee name alanı en fazla 30 karakter olmalıdır")
    private String name;
    private DepartmentUIDto departmentIoDto;
}
