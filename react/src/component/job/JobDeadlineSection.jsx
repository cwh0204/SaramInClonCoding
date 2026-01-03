import JobSection from "./JobSection"
import Card from "../ui/Card"
import Button from "../ui/Button"

function JobDeadlineSection({deadline}) {
  return (
    <>
        <JobSection title="접수기간 및 방법">
            <Card className="p-[20px] flex justify-between items-center">
                <div>
                    <p className="text-[13px] text-[#666] mb-[4px]">마감일</p>
                    <p className="text-[20px] font-bold text-[#2563eb]">
                       {deadline}
                    </p>
                    <p className="text-[13px] mt-[8px]">마감일 : 2026.01.17</p>
                </div>
                <Button className="w-[160px]">입사지원</Button>
            </Card>
        </JobSection>
    </>
  )
}

export default JobDeadlineSection