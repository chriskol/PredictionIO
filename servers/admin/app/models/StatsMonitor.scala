package models

trait StatsMonitor {

  /**
   * Get RAM usage in percent
   */
  def getRamUsage(): Double

  /**
   * Get CPU usage in percent
   */
  def getCpuUsage(): Double

  /**
   * Get RAM usage in percent for particular process
   *
   * @param pid
   * 			process id of given process
   */
  def getProcessRamUsage(pid: Long): Double

  /**
   * Get CPU usage in percent for particular process
   *
   * @param pid
   * 			process id of given process
   */
  def getProcessCpuUsage(pid: Long): Double

  /**
   * Get total Disk Space
   */
  def getTotalDiskSpace(): Long

  /**
   * Get total Disk Space used
   */
  def getUsedDiskSpace(): Long

  /**
   * Get total free Disk Space
   */
  def getFreeDiskSpace(): Long
}
