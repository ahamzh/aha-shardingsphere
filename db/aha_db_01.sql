SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_deptment_0
-- ----------------------------
DROP TABLE IF EXISTS `t_deptment_0`;
CREATE TABLE `t_deptment_0`  (
                                 `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                                 `deptment_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                                 `deptment_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 `create_time` datetime NULL DEFAULT current_timestamp,
                                 `update_time` datetime NULL DEFAULT current_timestamp,
                                 `area_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '部门表（用hint根据部门名称分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_deptment_0
-- ----------------------------

-- ----------------------------
-- Table structure for t_deptment_1
-- ----------------------------
DROP TABLE IF EXISTS `t_deptment_1`;
CREATE TABLE `t_deptment_1`  (
                                 `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                                 `deptment_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                                 `deptment_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 `create_time` datetime NULL DEFAULT current_timestamp,
                                 `update_time` datetime NULL DEFAULT current_timestamp,
                                 `area_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '部门表（用hint根据部门名称分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_deptment_1
-- ----------------------------

-- ----------------------------
-- Table structure for t_deptment_2
-- ----------------------------
DROP TABLE IF EXISTS `t_deptment_2`;
CREATE TABLE `t_deptment_2`  (
                                 `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                                 `deptment_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                                 `deptment_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 `create_time` datetime NULL DEFAULT current_timestamp,
                                 `update_time` datetime NULL DEFAULT current_timestamp,
                                 `area_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '部门表（用hint根据部门名称分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_deptment_2
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_0
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`  (
                             `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                             `dept_id` bigint(20) NOT NULL COMMENT '部门ID',
                             `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                             `user_age` int(11) NULL DEFAULT NULL,
                             `user_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                             `create_time` datetime NULL DEFAULT current_timestamp,
                             `update_time` datetime NULL DEFAULT current_timestamp,
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户表（根据用户id分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_0
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_1
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`  (
                             `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                             `dept_id` bigint(20) NOT NULL COMMENT '部门ID',
                             `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                             `user_age` int(11) NULL DEFAULT NULL,
                             `user_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                             `create_time` datetime NULL DEFAULT current_timestamp,
                             `update_time` datetime NULL DEFAULT current_timestamp,
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户表（根据用户id分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_1
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_2
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`  (
                             `id` bigint(20) NOT NULL COMMENT '主键（采用雪花算法）',
                             `dept_id` bigint(20) NOT NULL COMMENT '部门ID',
                             `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户名',
                             `user_age` int(11) NULL DEFAULT NULL,
                             `user_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
                             `create_time` datetime NULL DEFAULT current_timestamp,
                             `update_time` datetime NULL DEFAULT current_timestamp,
                             PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户表（根据用户id分表）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_2
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
