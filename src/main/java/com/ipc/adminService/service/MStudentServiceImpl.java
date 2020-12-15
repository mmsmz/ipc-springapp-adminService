package com.ipc.adminService.service;

import com.ipc.adminService.dto.UserDto;
import com.ipc.adminService.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MStudentServiceImpl  implements  MStudentSerivce{

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

//
//    @Autowired
//    ApprovalStatusRepository approvalStatusRepository;
//
//    /* To Add Course Details To Summary */
//    @Override
//    public String addCourseToPurchaseSummary(String userId, PurchaseCartDto purchaseCartDto) {
//        try {
//            StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
//            List<StudentPurchaseEntity> studentPurchaseEntityList = purchaseRepository
//                    .findByUserIdAndCoursePriceIdAndCourseScheduleId(userId,
//                            purchaseCartDto.getCoursePriceId(), purchaseCartDto.getCourseScheduleId());
//
//            if(studentPurchaseEntityList.size()!=0){
//                return  "Already Purchased";
//            }else {
//                studentPurEntity.setUserId(userId);
//                studentPurEntity.setCoursePriceId(purchaseCartDto.getCoursePriceId());
//                studentPurEntity.setCourseScheduleId(purchaseCartDto.getCourseScheduleId());
//                purchaseRepository.save(studentPurEntity);
//                return CommonConstant.SUCCESSFULLY;
//
//            }
//
//        } catch (Exception e) {
//            logger.info(e.getMessage());
//            return e.getMessage();
//        }
//    }

   /** Adding the student Details **/
    @Override
    public String register(UserDto userDto) {
        LocalDate localDate = LocalDate.now();

        try {
            List<UserEntity> checkEmail = studentRepository.findByEmail(userDto.getEmail());
            if (checkEmail.isEmpty()) {
                List<StudentEntity> checkNicNr = studentRepository.findByNicNr(userDto.getNicNr());
                if (checkNicNr.isEmpty()) {
                    StudentEntity student = new StudentEntity();
                    student.setFirstName(userDto.getFirstName());
                    student.setLastName(userDto.getLastName());
                    student.setNicNr(userDto.getNicNr());
                    student.setEmail(userDto.getEmail());
                    student.setMobile(userDto.getMobile());
                    student.setInstituteBranch(userDto.getInstitutebranch());
                    student.setDate(localDate);
                    student.setUserType(HomeConstant.TYPE_STUDENT);
                    student.setPassword(passwordEncoder.encode(userDto.getPassword()));
                    student.setLoginstatus(HomeConstant.activated);
                    studentRepository.save(student);
                    return HomeConstant.SUCCESSFULLY_REGISTERED;
                } else {
                    logger.info(HomeConstant.NICNR_ALREADY_EXISTING);
                    return HomeConstant.NICNR_ALREADY_EXISTING;
                }

            } else {
                logger.info(HomeConstant.EMAIL_ALREADY_EXISTING);
                return HomeConstant.EMAIL_ALREADY_EXISTING;
            }

        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }


}



